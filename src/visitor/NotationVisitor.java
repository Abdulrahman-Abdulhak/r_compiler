package visitor;

import antlr.ReactParser;
import antlr.ReactParserBaseVisitor;
import ast.BracketNotation;
import ast.DotNotation;
import ast.Notation;
import ast.ValidName;

public class NotationVisitor extends ReactParserBaseVisitor<Notation> {
    @Override
    public DotNotation visitDotNotation(ReactParser.DotNotationContext ctx) {
        return new DotNotation(
                new ValidName(ctx.validName().getText()),
                ctx.OPTIONAL_CHAINING_OP() != null
        );
    }
    
    @Override
    public Notation visitBracketNotation(ReactParser.BracketNotationContext ctx) {
        return new BracketNotation(
                new ExpressionVisitor().visit(ctx.expression()),
                ctx.OPTIONAL_CHAINING_OP() != null
        );
    }
}
