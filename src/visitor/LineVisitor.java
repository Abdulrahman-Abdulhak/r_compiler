package visitor;

import antlr.ReactParser;
import antlr.ReactParserBaseVisitor;
import ast.Block;
import ast.Line;

public class LineVisitor extends ReactParserBaseVisitor<Line> {
    @Override
    public Line visitStatementLine(ReactParser.StatementLineContext ctx) {
        return new StatementVisitor().visit(ctx.statement());
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
        return Util.fromBlock(ctx.block());
    }

    @Override
    public Line visitSpecialLineLine(ReactParser.SpecialLineLineContext ctx) {
        return new SpecialLineVisitor().visit(ctx.specialLine());
    }
}
