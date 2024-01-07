package visitor;

import antlr.ReactParser;
import antlr.ReactParserBaseVisitor;
import ast.*;

public class ReturnableVisitor extends ReactParserBaseVisitor<Returnable> {
    @Override
    public Returnable visitPrimitive(ReactParser.PrimitiveContext ctx) {
        var num = ctx.primeType().num();
        if(num != null) return new PrimeType(Double.parseDouble(num.getText()));

        var strings = ctx.primeType().strings();
        if(strings != null) {
            JsString str;
            if(strings.getChild(1).getChildCount() > 0) {
                str = new TemplateLiteralVisitor().visit(strings.getChild(1));
            } else str = new JsString(strings.getChild(1).getText());

            return new PrimeType(str);
        }

        var text = ctx.getText();

        if(text == "true" || text == "false") return new PrimeType(Boolean.parseBoolean(text));

        if(text == "null") return new PrimeType(new JsNull());

        return new PrimeType();
    }

    @Override
    public Returnable visitObject(ReactParser.ObjectContext ctx) {
        var obj = new JsObject();
        var props = ctx.objPropDefine();

        var objPropVisitor = new ObjectPropVisitor();
        for(var propCtx : props) {
            obj.addProperty(objPropVisitor.visit(propCtx));
        }

        return obj;
    }

    @Override
    public Returnable visitArray(ReactParser.ArrayContext ctx) {
        var arr = new JsArray();
        var expVisitor = new ExpressionVisitor();

        for(var item : ctx.expression()) {
            arr.addItem(expVisitor.visit(item));
        }

        return arr;
    }

    @Override
    public Returnable visitFunction(ReactParser.FunctionContext ctx) {
        return new FunctionVisitor().visit(ctx);
    }

    @Override
    public Returnable visitThisKeyword(ReactParser.ThisKeywordContext ctx) {
        return new ThisKeyword();
    }

    @Override
    public Returnable visitJsx(ReactParser.JsxContext ctx) {
        return super.visitJsx(ctx);
    }
}
