package visitor;

import Util.SymbolTableUtil;
import antlr.ReactParser;

import ast.*;
import ast.Void;
import errors.Error;
import symbolTable.SymbolTable;
import Util.VisitorUtil;

import java.util.Objects;

public class ExpressionVisitor extends GeneralVisitor<Expression> {
    public ExpressionVisitor(SymbolTable symbolTable, Error errors) {
        super(symbolTable, errors);
    }

    @Override
    public Expression visitParentheses(ReactParser.ParenthesesContext ctx) {
        return visit(ctx.expression());
    }

    @Override
    public Void visitVoid(ReactParser.VoidContext ctx) {
        return new Void(
            new ExpressionVisitor(symbolTable, errors).visit(ctx.expression()),
            SymbolTableUtil.getLine(ctx)
        );
    }

    @Override
    public FunctionCall visitFunctionCall(ReactParser.FunctionCallContext ctx) {
        Expression nameSpace = visit(ctx.expression());

        if(ctx.templateLiteral() != null) {
            var template = new TemplateLiteralVisitor(symbolTable, errors).visit(ctx.templateLiteral());
            return new FunctionCall(nameSpace, template, SymbolTableUtil.getLine(ctx));
        }

        Param param = new Param(SymbolTableUtil.getLine(ctx.param()));
        for (var exp : ctx.param().expression()) {
            param.addNewParameter(visit(exp));
        }

        return new FunctionCall(nameSpace, param, SymbolTableUtil.getLine(ctx));
    }

    @Override
    public MemberGet visitMemberGet(ReactParser.MemberGetContext ctx) {
        Expression parent = visit(ctx.expression());
        Notation notation = new NotationVisitor(symbolTable, errors).visit(ctx.notation());

        return new MemberGet(parent, notation, SymbolTableUtil.getLine(ctx));
    }

    @Override
    public New visitNew(ReactParser.NewContext ctx) {
        Expression expression = visit(ctx.expression());

        if(ctx.param() != null) {
            Param param = new Param(SymbolTableUtil.getLine(ctx.param()));
            for (var exp : ctx.param().expression()) {
                param.addNewParameter(visit(exp));
            }
            return new New(expression, param, SymbolTableUtil.getLine(ctx));
        }

        return new New(expression, SymbolTableUtil.getLine(ctx));
    }

    @Override
    public Incremental visitPostIncre(ReactParser.PostIncreContext ctx) {
        Expression exp = visit(ctx.expression());
        var incremental = new Incremental(exp, SymbolTableUtil.getLine(ctx));

        incremental.setPost(true);

        var sign = ctx.incrementsOp().getText();
        incremental.setIncrease(Objects.equals(sign, "++"));

        return incremental;
    }

    @Override
    public Incremental visitPreInc(ReactParser.PreIncContext ctx) {
        Expression exp = visit(ctx.expression());
        var incremental = new Incremental(exp, SymbolTableUtil.getLine(ctx));

        incremental.setPost(false);

        var sign = ctx.incrementsOp().getText();
        incremental.setIncrease(Objects.equals(sign, "++"));

        return incremental;
    }

    @Override
    public TypeOf visitTypeOf(ReactParser.TypeOfContext ctx) {
        return new TypeOf(
            new ExpressionVisitor(symbolTable, errors).visit(ctx.expression()),
            SymbolTableUtil.getLine(ctx)
        );
    }

    @Override
    public LogicalNot visitLogicalNOT(ReactParser.LogicalNOTContext ctx) {
        var exp = visit(ctx.expression());
        return new LogicalNot(exp, SymbolTableUtil.getLine(ctx));
    }

    @Override
    public Unary visitUnary(ReactParser.UnaryContext ctx) {
        var exp = visit(ctx.expression());
        var sign = ctx.unarysOp().getText();

        return new Unary(exp, sign, SymbolTableUtil.getLine(ctx));
    }

    @Override
    public Pow visitPow(ReactParser.PowContext ctx) {
        Expression left = visit(ctx.expression(0));
        Expression right = visit(ctx.expression(1));

        return new Pow(left, right, SymbolTableUtil.getLine(ctx));
    }

    @Override
    public Multiplication visitMult(ReactParser.MultContext ctx) {
        Expression left = visit(ctx.expression(0));
        String sign = ctx.multiplicativeOp().getText();
        Expression right = visit(ctx.expression(1));

        return new Multiplication(left, sign, right, SymbolTableUtil.getLine(ctx));
    }

    @Override
    public Addition visitAdd(ReactParser.AddContext ctx) {
        Expression left = visit(ctx.expression(0));
        String sign = ctx.additiveOp().getText();
        Expression right = visit(ctx.expression(1));

        return new Addition(left, sign, right, SymbolTableUtil.getLine(ctx));
    }

    @Override
    public Compare visitCompare(ReactParser.CompareContext ctx) {
        Expression left = visit(ctx.expression(0));
        String sign = ctx.compareOP().getText();
        Expression right = visit(ctx.expression(1));

        return new Compare(left, sign, right, SymbolTableUtil.getLine(ctx));
    }

    @Override
    public CompareWithEqual visitCompareWithEqual(ReactParser.CompareWithEqualContext ctx) {
        Expression left = visit(ctx.expression(0));
        String sign = ctx.equalCompareOP().getText();
        Expression right = visit(ctx.expression(1));

        return new CompareWithEqual(left, sign, right, SymbolTableUtil.getLine(ctx));
    }

    @Override
    public LogicalAnd visitLogicalAND(ReactParser.LogicalANDContext ctx) {
        Expression left = visit(ctx.expression(0));
        Expression right = visit(ctx.expression(1));

        return new LogicalAnd(left, right, SymbolTableUtil.getLine(ctx));
    }

    @Override
    public LogicalOr visitLogicalOR(ReactParser.LogicalORContext ctx) {
        Expression left = visit(ctx.expression(0));
        Expression right = visit(ctx.expression(1));

        return new LogicalOr(left, right, SymbolTableUtil.getLine(ctx));
    }

    @Override
    public LogicalNull visitLogicalNull(ReactParser.LogicalNullContext ctx) {
        Expression left = visit(ctx.expression(0));
        Expression right = visit(ctx.expression(1));

        return new LogicalNull(left, right, SymbolTableUtil.getLine(ctx));
    }

    @Override
    public TernaryOperator visitTernary(ReactParser.TernaryContext ctx) {
        Expression condition = visit(ctx.expression(0));
        Expression onTruth = visit(ctx.expression(1));
        Expression onFalse = visit(ctx.expression(2));

        return new TernaryOperator(condition, onTruth, onFalse, SymbolTableUtil.getLine(ctx));
    }

    @Override
    public Assignment visitAssignment(ReactParser.AssignmentContext ctx) {
        Expression left = visit(ctx.expression(0));
        String sign = ctx.assinmentOp().getText();
        Expression right = visit(ctx.expression(1));

        return new Assignment(left, sign, right, SymbolTableUtil.getLine(ctx));
    }

    @Override
    public ArraySpread visitArraySpread(ReactParser.ArraySpreadContext ctx) {
        Expression exp = visit(ctx.expression());
        return new ArraySpread(exp, SymbolTableUtil.getLine(ctx));
    }

    @Override
    public Comma visitComma(ReactParser.CommaContext ctx) {
        var expressionVisitor = new ExpressionVisitor(symbolTable, errors);

        return new Comma(
            expressionVisitor.visit(ctx.expression(0)),
            expressionVisitor.visit(ctx.expression(1)),
            SymbolTableUtil.getLine(ctx)
        );
    }

    @Override
    public ValidName visitVariable(ReactParser.VariableContext ctx) {
        return VisitorUtil.create(ctx.validName());
    }

    @Override
    public Returnable visitValue(ReactParser.ValueContext ctx) {
        return new ReturnableVisitor(symbolTable, errors).visit(ctx.returnable());
    }
}
