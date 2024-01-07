package visitor;

import antlr.ReactParser;
import antlr.ReactParserBaseVisitor;
import ast.Line;

public class LineVisitor extends ReactParserBaseVisitor<Line> {
    @Override
    public Line visitStatementLine(ReactParser.StatementLineContext ctx) {
        return super.visitStatementLine(ctx);
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
    public Line visitBlockLine(ReactParser.BlockLineContext ctx) {
        return super.visitBlockLine(ctx);
    }

    @Override
    public Line visitSpecialLineLine(ReactParser.SpecialLineLineContext ctx) {
        return super.visitSpecialLineLine(ctx);
    }
}
