package visitor;

import Util.SymbolTableUtil;
import antlr.ReactParser;

import ast.*;
import errors.Error;
import errors.messages.NotSameTag;
import symbolTable.SymbolTable;
import Util.VisitorUtil;

import java.util.Objects;

public class ReturnableVisitor extends GeneralVisitor<Returnable> {
    public ReturnableVisitor(SymbolTable symbolTable, Error errors) {
        super(symbolTable, errors);
    }

    @Override
    public PrimeType visitPrimitive(ReactParser.PrimitiveContext ctx) {
        var num = ctx.primeType().num();
        if(num != null) return new PrimeType(Double.parseDouble(num.getText()), SymbolTableUtil.getLine(num));

        var strings = ctx.primeType().strings();
        if(strings != null) {
            JsString str;
            if(strings.getChild(0).getChildCount() > 0) {
                str = new TemplateLiteralVisitor(symbolTable, errors).visit(strings.getChild(0));
            } else str = new JsString(strings.getChild(0).getText(), SymbolTableUtil.getLine(strings), symbolTable);

            return new PrimeType(str, SymbolTableUtil.getLine(ctx));
        }

        var text = ctx.getText();

        if(Objects.equals(text, "true") || Objects.equals(text, "false"))
            return new PrimeType(Boolean.parseBoolean(text), SymbolTableUtil.getLine(ctx));

        if(Objects.equals(text, "null"))
            return new PrimeType(new JsNull(SymbolTableUtil.getLine(ctx)), SymbolTableUtil.getLine(ctx));

        return new PrimeType(SymbolTableUtil.getLine(ctx));
    }

    @Override
    public JsObject visitObject(ReactParser.ObjectContext ctx) {
        var obj = new JsObject(SymbolTableUtil.getLine(ctx), symbolTable);
        var props = ctx.objPropDefine();

        var objPropVisitor = new ObjectPropVisitor(symbolTable, errors);
        for(var propCtx : props) {
            obj.addProperty(objPropVisitor.visit(propCtx));
        }

        return obj;
    }

    @Override
    public JsArray visitArray(ReactParser.ArrayContext ctx) {
        var arr = new JsArray(SymbolTableUtil.getLine(ctx), symbolTable);
        var expVisitor = new ExpressionVisitor(symbolTable, errors);

        for(var item : ctx.expression()) {
            arr.addItem(expVisitor.visit(item));
        }

        return arr;
    }

    @Override
    public Function visitFunction(ReactParser.FunctionContext ctx) {
        return new FunctionVisitor(symbolTable, errors).visit(ctx);
    }

    @Override
    public ThisKeyword visitThisKeyword(ReactParser.ThisKeywordContext ctx) {
        return new ThisKeyword(SymbolTableUtil.getLine(ctx), symbolTable);
    }

    @Override
    public JSX visitJsx(ReactParser.JsxContext ctx) {
        var voidTagCtx = ctx.voidTag();
        if(voidTagCtx != null) {
            var name = voidTagCtx.jsxName();
            var exp = name.expression();
            JSX jsx;
            if(exp != null) jsx = new JSX(new ExpressionVisitor(symbolTable, errors).visit(exp), SymbolTableUtil.getLine(exp), symbolTable);
            else if(name.validName() != null) jsx = new JSX(new ValidName(name.validName().getText(), SymbolTableUtil.getLine(exp), symbolTable), SymbolTableUtil.getLine(exp), symbolTable);
            else jsx = new JSX(voidTagCtx.jsxName().getText(), SymbolTableUtil.getLine(voidTagCtx), symbolTable);

            var attrsCtx = voidTagCtx.attibuteValue();
            VisitorUtil.fromAttrList(jsx, attrsCtx, symbolTable, errors);

            return jsx;
        }
        var fullTagCtx = ctx.fullTag();
        JSX jsx;

        var exp = fullTagCtx.jsxName(0).expression();
        if(exp != null) jsx = new JSX(new ExpressionVisitor(symbolTable, errors).visit(exp), SymbolTableUtil.getLine(exp), symbolTable);
        else jsx = new JSX(fullTagCtx.jsxName(0).getText(), SymbolTableUtil.getLine(fullTagCtx), symbolTable);

        var attrsCtx = fullTagCtx.attibuteValue();
        VisitorUtil.fromAttrList(jsx, attrsCtx, symbolTable, errors);

        var childrenCtx = fullTagCtx.jsxChildren();
        for (var childCtx : childrenCtx) {
            if(childCtx.jsInJsx() != null) {
                var js = new ExpressionVisitor(symbolTable, errors).visit(childCtx.jsInJsx().expression());
                jsx.addChild(new JSinJSX(js, SymbolTableUtil.getLine(childCtx.jsInJsx()), symbolTable));
            } else if (childCtx.words() != null) {
                jsx.addChild(new WordJSX(childCtx.words().getText(), SymbolTableUtil.getLine(childCtx.words())));
            } else {
                jsx.addChild(visitJsx(childCtx.jsx()));
            }
        }

        if(!Objects.equals(fullTagCtx.jsxName(0).getText(), fullTagCtx.jsxName(1).getText())) {
            errors.addError(
                new NotSameTag(
                    SymbolTableUtil.getLine(fullTagCtx.jsxName(1))
                )
            );
        }

        return jsx;
    }
}
