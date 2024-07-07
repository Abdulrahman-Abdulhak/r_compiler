package visitor;

import antlr.ReactParser;

import ast.Block;
import ast.Line;

import Util.VisitorUtil;
import symbolTable.SymbolTable;

public class LineVisitor extends GeneralVisitor<Line> {
    public LineVisitor(SymbolTable symbolTable) {
        super(symbolTable);
    }

    @Override
    public Line visitStatementLine(ReactParser.StatementLineContext ctx) {
        return new StatementVisitor(symbolTable).visit(ctx.statement());
    }

    @Override
    public Line visitIfLine(ReactParser.IfLineContext ctx) {
        return super.visitIfLine(ctx);
    }

    @Override
    public Line visitWhileLine(ReactParser.WhileLineContext ctx) {
        return super.visitWhileLine(ctx);
    }

    @Override
    public Line visitForLine(ReactParser.ForLineContext ctx) {
        return super.visitForLine(ctx);
    }

    @Override
    public Line visitForInLine(ReactParser.ForInLineContext ctx) {
        return super.visitForInLine(ctx);
    }

    @Override
    public Line visitForOfLine(ReactParser.ForOfLineContext ctx) {
        return super.visitForOfLine(ctx);
    }

    @Override
    public Line visitDoWhileLine(ReactParser.DoWhileLineContext ctx) {
        return super.visitDoWhileLine(ctx);
    }

    @Override
    public Block visitBlockLine(ReactParser.BlockLineContext ctx) {
        return VisitorUtil.create(ctx.block(), symbolTable);
    }

    @Override
    public Line visitSpecialLineLine(ReactParser.SpecialLineLineContext ctx) {
        return new SpecialLineVisitor(symbolTable).visit(ctx.specialLine());
    }
}
