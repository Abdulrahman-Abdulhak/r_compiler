package visitor;

import antlr.ReactParser;
import antlr.ReactParserBaseVisitor;
import ast.Notation;

public class NotationVisitor extends ReactParserBaseVisitor<Notation> {
    @Override
    public Notation visitDotNotation(ReactParser.DotNotationContext ctx) {
        return super.visitDotNotation(ctx);
    }
    
    @Override
    public Notation visitBracketNotation(ReactParser.BracketNotationContext ctx) {
        return super.visitBracketNotation(ctx);
    }
}
