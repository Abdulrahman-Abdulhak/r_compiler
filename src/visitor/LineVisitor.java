package visitor;

import Util.SymbolTableUtil;
import antlr.ReactParser;

import ast.*;

import Util.VisitorUtil;
import symbolTable.SymbolTable;
import symbolTable.property.SymbolDefineMethod;

import java.util.ArrayList;

public class LineVisitor extends GeneralVisitor<Line> {
    public LineVisitor(SymbolTable symbolTable) {
        super(symbolTable);
    }

    @Override
    public Line visitFunctionLines(ReactParser.FunctionLinesContext ctx) {
        return visit(ctx.getChild(0));
    }

    @Override
    public Line visitAllLines(ReactParser.AllLinesContext ctx) {
        return visit(ctx.getChild(0));
    }

    @Override
    public Break visitBreak(ReactParser.BreakContext ctx) {
        var label = ctx.STRING();
        if(label != null) return new Break(label.getText(), SymbolTableUtil.getLine(ctx));
        return new Break(SymbolTableUtil.getLine(ctx));
    }

    @Override
    public Continue visitContinue(ReactParser.ContinueContext ctx) {
        var label = ctx.STRING();
        if(label != null) return new Continue(label.getText(), SymbolTableUtil.getLine(ctx));
        return new Continue(SymbolTableUtil.getLine(ctx));
    }

    @Override
    public Return visitReturn(ReactParser.ReturnContext ctx) {
        var exp = ctx.expression();
        if(exp != null) return new Return(new ExpressionVisitor(symbolTable).visit(exp), SymbolTableUtil.getLine(ctx));
        return new Return(SymbolTableUtil.getLine(ctx));
    }

    @Override
    public Statement visitStatementLine(ReactParser.StatementLineContext ctx) {
        return new StatementVisitor(symbolTable).visit(ctx.statement());
    }

    @Override
    public If visitIfLine(ReactParser.IfLineContext ctx) {
        var test = new ExpressionVisitor(symbolTable).visit(ctx.if_().expression());

        var line = ctx.if_().allLines();
        var block = ctx.if_().block();

        if(line != null) {
            return new If(test, visitAllLines(line), SymbolTableUtil.getLine(ctx));
        }

        return new If(
            test,
            new BlockVisitor(
                symbolTable.addTable(symbolTable.getName() + ".if")
            ).visitBlock(block),
            SymbolTableUtil.getLine(ctx)
        );
    }

    @Override
    public Switch visitSwitchLine(ReactParser.SwitchLineContext ctx) {
        var test = new ExpressionVisitor(symbolTable).visit(ctx.switch_().expression());

        // scope of switch
        var switchBodySymbols = new SymbolTable(symbolTable.getName() + ".switch");
        symbolTable.addTable(switchBodySymbols);

        var cases = new ArrayList<Case>();
        var caseVisitor = new CaseVisitor(switchBodySymbols);
        for (var caseLine : ctx.switch_().switchBody().caseLine()) {
            cases.add(caseVisitor.visitCaseLine(caseLine));
        }

        return new Switch(test, cases, SymbolTableUtil.getLine(ctx));
    }

    @Override
    public While visitWhileLine(ReactParser.WhileLineContext ctx) {
        var test = new ExpressionVisitor(symbolTable).visit(ctx.while_().expression());

        var line = ctx.while_().allLines();
        var block = ctx.while_().block();

        if(line != null) {
            return new While(test, visitAllLines(line), SymbolTableUtil.getLine(ctx));
        }

        return new While(
            test,
            new BlockVisitor(
                symbolTable.addTable(symbolTable.getName() + ".while")
            ).visitBlock(block),
            SymbolTableUtil.getLine(ctx)
        );
    }

    @Override
    public DoWhile visitDoWhileLine(ReactParser.DoWhileLineContext ctx) {
        var test = new ExpressionVisitor(symbolTable).visit(ctx.doWhile().expression());

        var line = ctx.doWhile().allLines();
        var block = ctx.doWhile().block();

        if(line != null) {
            return new DoWhile(test, visitAllLines(line), SymbolTableUtil.getLine(ctx));
        }

        return new DoWhile(
            test,
            new BlockVisitor(
                symbolTable.addTable(symbolTable.getName() + ".while")
            ).visitBlock(block),
            SymbolTableUtil.getLine(ctx)
        );
    }

    @Override
    public For visitForLine(ReactParser.ForLineContext ctx) {
        var forCtx = ctx.for_();
        var init = forCtx.forExpression1();

        var exp2Context = forCtx.forExpression2();
        var exp3Context = forCtx.forExpression3();

        var forTable = symbolTable.addTable(symbolTable.getName() + ".for");

        var expressionVisitor = new ExpressionVisitor(forTable);
        var expList2 = exp2Context != null ? new ArrayList<Expression>() : null;
        var expList3 = exp3Context != null ? new ArrayList<Expression>() : null;

        if(expList2 != null)
            for (var exp : exp2Context.expressionList().expression()) {
                expList2.add(expressionVisitor.visit(exp));
            }
        if(expList3 != null)
            for (var exp : exp3Context.expressionList().expression()) {
                expList3.add(expressionVisitor.visit(exp));
            }

        var body = forCtx.block() != null
                ? new BlockVisitor(forTable).visitBlock(forCtx.block())
                : null;
        var line = forCtx.allLines() != null
                ? new LineVisitor(forTable).visitAllLines(forCtx.allLines())
                : null;

        if(init == null || init.declare() != null) {
            var declareContext = init != null ? init.declare() : null;
            var declare = declareContext != null ? new DeclareVisitor(forTable).visit(declareContext) : null;

            return body == null
                    ? new For(declare, expList2, expList3, line, SymbolTableUtil.getLine(ctx))
                    : new For(declare, expList2, expList3, body, SymbolTableUtil.getLine(ctx));
        }

        var exp1Context = init.expressionList();
        var expList1 = new ArrayList<Expression>();
        for (var exp : exp1Context.expression()) {
            expList1.add(expressionVisitor.visit(exp));
        }

        return body == null
                ? new For(expList1, expList2, expList3, line, SymbolTableUtil.getLine(ctx))
                : new For(expList1, expList2, expList3, body, SymbolTableUtil.getLine(ctx));
    }

    @Override
    public ForIn visitForInLine(ReactParser.ForInLineContext ctx) {
        var forCtx = ctx.forin();

        var forTable = symbolTable.addTable(symbolTable.getName() + ".for-in");
        var variable = VisitorUtil.create(forCtx.validName());

        SymbolTableUtil.initSymbol(forTable, variable.getIdentifier(), forCtx.validName(), new SymbolDefineMethod(forCtx.declarers().getText()));

        var iterable = new ExpressionVisitor(forTable).visit(forCtx.expression());
        var body = forCtx.block() != null
                ? new BlockVisitor(forTable).visitBlock(forCtx.block())
                : null;
        var line = forCtx.allLines() != null
                ? new LineVisitor(forTable).visitAllLines(forCtx.allLines())
                : null;

        return body == null
                ? new ForIn(variable, iterable, line, SymbolTableUtil.getLine(ctx))
                : new ForIn(variable, iterable, body, SymbolTableUtil.getLine(ctx));
    }

    @Override
    public ForOf visitForOfLine(ReactParser.ForOfLineContext ctx) {
        var forCtx = ctx.forof();

        var forTable = symbolTable.addTable(symbolTable.getName() + ".for-of");
        var variable = VisitorUtil.create(forCtx.validName());

        SymbolTableUtil.initSymbol(forTable, variable.getIdentifier(), forCtx.validName(), new SymbolDefineMethod(forCtx.declarers().getText()));

        var iterable = new ExpressionVisitor(forTable).visit(forCtx.expression());
        var body = forCtx.block() != null
                ? new BlockVisitor(forTable).visitBlock(forCtx.block())
                : null;
        var line = forCtx.allLines() != null
                ? new LineVisitor(forTable).visitAllLines(forCtx.allLines())
                : null;

        return body == null
                ? new ForOf(variable, iterable, line, SymbolTableUtil.getLine(ctx))
                : new ForOf(variable, iterable, body, SymbolTableUtil.getLine(ctx));
    }

    @Override
    public Block visitBlockLine(ReactParser.BlockLineContext ctx) {
        var newTable = symbolTable.addTable(symbolTable.getName() + ".block");
        return VisitorUtil.create(ctx.block(), newTable);
    }
}
