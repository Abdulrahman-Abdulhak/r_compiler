package visitor;

import Util.SymbolTableUtil;
import antlr.ReactParser;
import ast.Case;
import ast.Expression;
import ast.Line;
import symbolTable.SymbolTable;

import java.util.ArrayList;

public class CaseVisitor extends GeneralVisitor<Case> {
    public CaseVisitor(SymbolTable symbolTable) {
        super(symbolTable);
    }

    @Override
    public Case visitCaseLine(ReactParser.CaseLineContext ctx) {
        var haveDefault = ctx.DEFAULT() != null;

        var values = new ArrayList<Expression>();
        var expressionVisitor = new ExpressionVisitor(symbolTable);
        for (var exp : ctx.expression()) {
            values.add(expressionVisitor.visit(exp));
        }

        var lines = new ArrayList<Line>();
        var lineVisitor = new LineVisitor(symbolTable);
        for (var line : ctx.allLines()) {
            lines.add(lineVisitor.visit(line));
        }

        return new Case(values, lines, haveDefault, SymbolTableUtil.getLine(ctx));
    }
}
