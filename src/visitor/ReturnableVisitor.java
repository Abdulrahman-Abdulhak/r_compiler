package visitor;

import Util.SymbolTableUtil;
import antlr.ReactParser;

import ast.*;
import symbolTable.SymbolTable;
import Util.VisitorUtil;

import java.util.Objects;

public class ReturnableVisitor extends GeneralVisitor<Returnable> {
    public ReturnableVisitor(SymbolTable symbolTable) {
        super(symbolTable);
    }

    @Override
    public PrimeType visitPrimitive(ReactParser.PrimitiveContext ctx) {
        var num = ctx.primeType().num();
        if(num != null) return new PrimeType(Double.parseDouble(num.getText()), SymbolTableUtil.getLine(num));

        var strings = ctx.primeType().strings();
        if(strings != null) {
            JsString str;
            if(strings.getChild(0).getChildCount() > 0) {
                str = new TemplateLiteralVisitor(symbolTable).visit(strings.getChild(0));
            } else str = new JsString(strings.getChild(0).getText(), SymbolTableUtil.getLine(strings));

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
        var obj = new JsObject(SymbolTableUtil.getLine(ctx));
        var props = ctx.objPropDefine();

        var objPropVisitor = new ObjectPropVisitor(symbolTable);
        for(var propCtx : props) {
            obj.addProperty(objPropVisitor.visit(propCtx));
        }

        return obj;
    }

    @Override
    public JsArray visitArray(ReactParser.ArrayContext ctx) {
        var arr = new JsArray(SymbolTableUtil.getLine(ctx));
        var expVisitor = new ExpressionVisitor(symbolTable);

        for(var item : ctx.expression()) {
            arr.addItem(expVisitor.visit(item));
        }

        return arr;
    }

    @Override
    public Function visitFunction(ReactParser.FunctionContext ctx) {
        return new FunctionVisitor(symbolTable).visit(ctx);
    }

    @Override
    public ThisKeyword visitThisKeyword(ReactParser.ThisKeywordContext ctx) {
        return new ThisKeyword(SymbolTableUtil.getLine(ctx));
    }

    @Override
    public JSX visitJsx(ReactParser.JsxContext ctx) {
        var voidTagCtx = ctx.voidTag();
        if(voidTagCtx != null) {
            var exp = voidTagCtx.jsxName().expression();
            JSX jsx;
            if(exp != null) jsx = new JSX(new ExpressionVisitor(symbolTable).visit(exp), SymbolTableUtil.getLine(exp));
            else jsx = new JSX(voidTagCtx.jsxName().getText(), SymbolTableUtil.getLine(voidTagCtx));

            var attrsCtx = voidTagCtx.attibuteValue();
            VisitorUtil.fromAttrList(jsx, attrsCtx, symbolTable);

            return jsx;
        }
        var fullTagCtx = ctx.fullTag();
        JSX jsx;

        var exp = fullTagCtx.jsxName(0).expression();
        if(exp != null) jsx = new JSX(new ExpressionVisitor(symbolTable).visit(exp), SymbolTableUtil.getLine(exp));
        else jsx = new JSX(fullTagCtx.jsxName(0).getText(), SymbolTableUtil.getLine(fullTagCtx));

        var attrsCtx = fullTagCtx.attibuteValue();
        VisitorUtil.fromAttrList(jsx, attrsCtx, symbolTable);

        var childrenCtx = fullTagCtx.jsxChildren();
        for (var childCtx : childrenCtx) {
            if(childCtx.jsInJsx() != null) {
                var js = new ExpressionVisitor(symbolTable).visit(childCtx.jsInJsx().expression());
                jsx.addChild(new JSinJSX(js, SymbolTableUtil.getLine(childCtx.jsInJsx())));
            } else {
                jsx.addChild(visitJsx(childCtx.jsx()));
            }
        }

        return jsx;
    }
}
