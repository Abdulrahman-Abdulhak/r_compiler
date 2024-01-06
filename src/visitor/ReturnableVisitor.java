package visitor;

import antlr.ReactParser;
import antlr.ReactParserBaseVisitor;
import ast.Returnable;
import ast.ThisKeyword;

public class ReturnableVisitor extends ReactParserBaseVisitor<Returnable> {
    @Override
    public Returnable visitPrimitive(ReactParser.PrimitiveContext ctx) {
        return super.visitPrimitive(ctx);
    }

    @Override
    public Returnable visitObject(ReactParser.ObjectContext ctx) {
        return super.visitObject(ctx);
    }

    @Override
    public Returnable visitArray(ReactParser.ArrayContext ctx) {
        return super.visitArray(ctx);
    }

    @Override
    public Returnable visitFunction(ReactParser.FunctionContext ctx) {
        return super.visitFunction(ctx);
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
