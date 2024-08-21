package visitor;

import Util.SymbolTableUtil;
import antlr.ReactParser;

import ast.BracketNotation;
import ast.DotNotation;
import ast.Notation;
import ast.ValidName;

import errors.Error;
import symbolTable.SymbolTable;

public class NotationVisitor extends GeneralVisitor<Notation> {
    public NotationVisitor(SymbolTable symbolTable, Error errors) {
        super(symbolTable, errors);
    }

    @Override
    public DotNotation visitDotNotation(ReactParser.DotNotationContext ctx) {
        return new DotNotation(
            new ValidName(ctx.allPossibleWords().getText(), SymbolTableUtil.getLine(ctx.allPossibleWords()), symbolTable),
            ctx.OPTIONAL_CHAINING_OP() != null,
            SymbolTableUtil.getLine(ctx),
            symbolTable
        );
    }
    
    @Override
    public Notation visitBracketNotation(ReactParser.BracketNotationContext ctx) {
        return new BracketNotation(
            new ExpressionVisitor(symbolTable, errors).visit(ctx.expression()),
            ctx.OPTIONAL_CHAINING_OP() != null,
            SymbolTableUtil.getLine(ctx),
            symbolTable
        );
    }
}
