package visitor;

import antlr.ReactParser;

import ast.BracketNotation;
import ast.DotNotation;
import ast.Notation;
import ast.ValidName;

import symbolTable.SymbolTable;

public class NotationVisitor extends GeneralVisitor<Notation> {
    public NotationVisitor(SymbolTable symbolTable) {
        super(symbolTable);
    }

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
                new ExpressionVisitor(symbolTable).visit(ctx.expression()),
                ctx.OPTIONAL_CHAINING_OP() != null
        );
    }
}
