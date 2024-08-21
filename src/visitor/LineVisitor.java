package visitor;

import antlr.ReactParser;

import ast.*;

import Util.VisitorUtil;
import Util.SymbolTableUtil;
import errors.Error;
import errors.messages.ReturnOutsideFunction;
import symbolTable.SymbolTable;
import symbolTable.VariableDefineMethod;
import symbolTable.property.SymbolDefineMethod;

import java.util.ArrayList;

public class LineVisitor extends GeneralVisitor<Line> {
    public LineVisitor(SymbolTable symbolTable, Error errors) {
        super(symbolTable, errors);
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
        if(label != null) return new Break(label.getText(), SymbolTableUtil.getLine(ctx), symbolTable);
        return new Break(SymbolTableUtil.getLine(ctx), symbolTable);
    }

    @Override
    public Continue visitContinue(ReactParser.ContinueContext ctx) {
        var label = ctx.STRING();
        if(label != null) return new Continue(label.getText(), SymbolTableUtil.getLine(ctx), symbolTable);
        return new Continue(SymbolTableUtil.getLine(ctx), symbolTable);
    }

    @Override
    public Return visitReturn(ReactParser.ReturnContext ctx) {
        var exp = ctx.expression();
        if(!symbolTable.getName().contains(".function")) {
            errors.addError(
                new ReturnOutsideFunction(
                    SymbolTableUtil.getLine(ctx)
                )
            );
        }
        if(exp != null) return new Return(new ExpressionVisitor(symbolTable, errors).visit(exp), SymbolTableUtil.getLine(ctx), symbolTable);
        return new Return(SymbolTableUtil.getLine(ctx), symbolTable);
    }

    @Override
    public Statement visitStatementLine(ReactParser.StatementLineContext ctx) {
        return new StatementVisitor(symbolTable, errors).visit(ctx.statement());
    }

    @Override
    public If visitIfLine(ReactParser.IfLineContext ctx) {
        if(ctx.ifLines().if_() != null) {
            return visitIf(ctx.ifLines().if_());
        }
        if(ctx.ifLines().ifElse() != null) {
            return visitIfElse(ctx.ifLines().ifElse());
        }
        if(ctx.ifLines().ifElseIf() != null) {
            return visitIfElseIf(ctx.ifLines().ifElseIf());
        }

        return visitIfElseIfElse(ctx.ifLines().ifElseIfElse());
    }

    @Override
    public If visitIf(ReactParser.IfContext ctx) {
        var test = new ExpressionVisitor(symbolTable, errors).visit(ctx.expression());

        var line = ctx.allLines();
        var block = ctx.block();

        If theIf;

        if(line != null) {
            theIf = new If(test, visitAllLines(line), SymbolTableUtil.getLine(ctx), symbolTable);
        } else {
            theIf = new If(
                test,
                new BlockVisitor(
                    symbolTable.addTable(symbolTable.getName() + ".if"),
                    errors
                ).visitBlock(block),
                SymbolTableUtil.getLine(ctx),
                symbolTable
            );
        }

        return theIf;
    }

    @Override
    public If visitIfElse(ReactParser.IfElseContext ctx) {
        var test = new ExpressionVisitor(symbolTable, errors).visit(ctx.if_().expression());

        var line = ctx.if_().allLines();
        var block = ctx.if_().block();

        If theIf;

        if(line != null) {
            theIf = new If(test, visitAllLines(line), SymbolTableUtil.getLine(ctx), symbolTable);
        } else {
            theIf = new If(
                test,
                new BlockVisitor(
                    symbolTable.addTable(symbolTable.getName() + ".if"),
                    errors
                ).visitBlock(block),
                SymbolTableUtil.getLine(ctx),
                symbolTable
            );
        }

        var elseContext = ctx.else_();

        if (elseContext != null)
            theIf.setChainedElse(visitElse(elseContext));

        return theIf;
    }

    @Override
    public If visitIfElseIf(ReactParser.IfElseIfContext ctx) {
        var test = new ExpressionVisitor(symbolTable, errors).visit(ctx.if_().expression());

        var line = ctx.if_().allLines();
        var block = ctx.if_().block();

        If theIf;

        if(line != null) {
            theIf = new If(test, visitAllLines(line), SymbolTableUtil.getLine(ctx), symbolTable);
        } else {
            theIf = new If(
                test,
                new BlockVisitor(
                    symbolTable.addTable(symbolTable.getName() + ".if"),
                    errors
                ).visitBlock(block),
                SymbolTableUtil.getLine(ctx),
                symbolTable
            );
        }

        var elseIfContexts = ctx.elseIf();

        if(elseIfContexts != null)
            for (var elseIfContext : elseIfContexts) {
                theIf.addElseIf(visitElseIf(elseIfContext));
            }

        return theIf;
    }

    @Override
    public If visitIfElseIfElse(ReactParser.IfElseIfElseContext ctx) {
        var test = new ExpressionVisitor(symbolTable, errors).visit(ctx.if_().expression());

        var line = ctx.if_().allLines();
        var block = ctx.if_().block();

        If theIf;

        if(line != null) {
            theIf = new If(test, visitAllLines(line), SymbolTableUtil.getLine(ctx), symbolTable);
        } else {
            theIf = new If(
                test,
                new BlockVisitor(
                    symbolTable.addTable(symbolTable.getName() + ".if"),
                    errors
                ).visitBlock(block),
                SymbolTableUtil.getLine(ctx),
                symbolTable
            );
        }

        var elseIfContexts = ctx.elseIf();
        var elseContext = ctx.else_();

        if(elseIfContexts != null)
            for (var elseIfContext : elseIfContexts) {
                theIf.addElseIf(visitElseIf(elseIfContext));
            }

        if (elseContext != null)
            theIf.setChainedElse(visitElse(elseContext));

        return theIf;
    }

    @Override
    public ElseIf visitElseIf(ReactParser.ElseIfContext ctx) {
        var test = new ExpressionVisitor(symbolTable, errors).visit(ctx.expression());

        var line = ctx.allLines();
        var block = ctx.block();

        if(line != null) {
            return new ElseIf(test, visitAllLines(line), SymbolTableUtil.getLine(ctx), symbolTable);
        }

        return new ElseIf(
            test,
            new BlockVisitor(
                symbolTable.addTable(symbolTable.getName() + ".else-if"),
                errors
            ).visitBlock(block),
            SymbolTableUtil.getLine(ctx),
            symbolTable
        );
    }

    @Override
    public Else visitElse(ReactParser.ElseContext ctx) {
        var line = ctx.allLines();
        var block = ctx.block();

        if(line != null) {
            return new Else(visitAllLines(line), SymbolTableUtil.getLine(ctx), symbolTable);
        }

        return new Else(
            new BlockVisitor(
                symbolTable.addTable(symbolTable.getName() + ".else"),
                errors
            ).visitBlock(block),
            SymbolTableUtil.getLine(ctx),
            symbolTable
        );
    }

    @Override
    public Switch visitSwitchLine(ReactParser.SwitchLineContext ctx) {
        var test = new ExpressionVisitor(symbolTable, errors).visit(ctx.switch_().expression());

        // scope of switch
        var switchBodySymbols = new SymbolTable(symbolTable.getName() + ".switch");
        symbolTable.addTable(switchBodySymbols);

        var cases = new ArrayList<Case>();
        var caseVisitor = new CaseVisitor(switchBodySymbols, errors);
        for (var caseLine : ctx.switch_().switchBody().caseLine()) {
            cases.add(caseVisitor.visitCaseLine(caseLine));
        }

        return new Switch(test, cases, SymbolTableUtil.getLine(ctx), symbolTable);
    }

    @Override
    public While visitWhileLine(ReactParser.WhileLineContext ctx) {
        var test = new ExpressionVisitor(symbolTable, errors).visit(ctx.while_().expression());

        var line = ctx.while_().allLines();
        var block = ctx.while_().block();

        if(line != null) {
            return new While(test, visitAllLines(line), SymbolTableUtil.getLine(ctx), symbolTable);
        }

        return new While(
            test,
            new BlockVisitor(
                symbolTable.addTable(symbolTable.getName() + ".while"),
                errors
            ).visitBlock(block),
            SymbolTableUtil.getLine(ctx),
            symbolTable
        );
    }

    @Override
    public DoWhile visitDoWhileLine(ReactParser.DoWhileLineContext ctx) {
        var test = new ExpressionVisitor(symbolTable, errors).visit(ctx.doWhile().expression());
        var block = new BlockVisitor(
            symbolTable.addTable(symbolTable.getName() + ".while"),
            errors
        ).visitBlock(ctx.doWhile().block());

        return new DoWhile(test, block, SymbolTableUtil.getLine(ctx), symbolTable);
    }

    @Override
    public For visitForLine(ReactParser.ForLineContext ctx) {
        var forCtx = ctx.for_();
        var init = forCtx.forExpression1();

        var exp2Context = forCtx.forExpression2();
        var exp3Context = forCtx.forExpression3();

        var forTable = symbolTable.addTable(symbolTable.getName() + ".for");

        var expressionVisitor = new ExpressionVisitor(forTable, errors);
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
                ? new BlockVisitor(forTable, errors).visitBlock(forCtx.block())
                : null;
        var line = forCtx.allLines() != null
                ? new LineVisitor(forTable, errors).visitAllLines(forCtx.allLines())
                : null;

        if(init == null || init.declare() != null) {
            var declareContext = init != null ? init.declare() : null;
            var declare = declareContext != null ? new DeclareVisitor(forTable, errors).visit(declareContext) : null;

            return body == null
                    ? new For(declare, expList2, expList3, line, SymbolTableUtil.getLine(ctx), symbolTable)
                    : new For(declare, expList2, expList3, body, SymbolTableUtil.getLine(ctx), symbolTable);
        }

        var exp1Context = init.expressionList();
        var expList1 = new ArrayList<Expression>();
        for (var exp : exp1Context.expression()) {
            expList1.add(expressionVisitor.visit(exp));
        }

        return body == null
                ? new For(expList1, expList2, expList3, line, SymbolTableUtil.getLine(ctx), symbolTable)
                : new For(expList1, expList2, expList3, body, SymbolTableUtil.getLine(ctx), symbolTable);
    }

    @Override
    public ForIn visitForInLine(ReactParser.ForInLineContext ctx) {
        var forCtx = ctx.forin();

        var forTable = symbolTable.addTable(symbolTable.getName() + ".for-in");
        var variable = VisitorUtil.create(forCtx.validName(), symbolTable);

        var varDefineMethod = VariableDefineMethod.fromString(forCtx.declarers().getText());
        SymbolTableUtil.initSymbol(forTable, variable.getIdentifier(), forCtx.validName(), new SymbolDefineMethod(varDefineMethod));

        var iterable = new ExpressionVisitor(forTable, errors).visit(forCtx.expression());
        var body = forCtx.block() != null
                ? new BlockVisitor(forTable, errors).visitBlock(forCtx.block())
                : null;
        var line = forCtx.allLines() != null
                ? new LineVisitor(forTable, errors).visitAllLines(forCtx.allLines())
                : null;

        return body == null
                ? new ForIn(varDefineMethod, variable, iterable, line, SymbolTableUtil.getLine(ctx), symbolTable)
                : new ForIn(varDefineMethod, variable, iterable, body, SymbolTableUtil.getLine(ctx), symbolTable);
    }

    @Override
    public ForOf visitForOfLine(ReactParser.ForOfLineContext ctx) {
        var forCtx = ctx.forof();

        var forTable = symbolTable.addTable(symbolTable.getName() + ".for-of");
        var variable = VisitorUtil.create(forCtx.validName(), symbolTable);

        var varDefineMethod = VariableDefineMethod.fromString(forCtx.declarers().getText());
        SymbolTableUtil.initSymbol(forTable, variable.getIdentifier(), forCtx.validName(), new SymbolDefineMethod(varDefineMethod));

        var iterable = new ExpressionVisitor(forTable, errors).visit(forCtx.expression());
        var body = forCtx.block() != null
                ? new BlockVisitor(forTable, errors).visitBlock(forCtx.block())
                : null;
        var line = forCtx.allLines() != null
                ? new LineVisitor(forTable, errors).visitAllLines(forCtx.allLines())
                : null;


        return body == null
                ? new ForOf(varDefineMethod, variable, iterable, line, SymbolTableUtil.getLine(ctx), symbolTable)
                : new ForOf(varDefineMethod, variable, iterable, body, SymbolTableUtil.getLine(ctx), symbolTable);
    }

    @Override
    public Block visitBlockLine(ReactParser.BlockLineContext ctx) {
        var newTable = symbolTable.addTable(symbolTable.getName() + ".block");
        return VisitorUtil.create(ctx.block(), newTable, errors);
    }
}
