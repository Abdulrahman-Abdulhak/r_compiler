package visitor;

import antlr.ReactParser;
import antlr.ReactParserBaseVisitor;
import ast.Param;

public class ParamVisitor extends ReactParserBaseVisitor<Param> {
    @Override
    public Param visitParam(ReactParser.ParamContext ctx) {
        return super.visitParam(ctx);
    }
}
