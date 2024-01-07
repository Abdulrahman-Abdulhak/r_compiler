package visitor;

import antlr.ReactParser;
import antlr.ReactParserBaseVisitor;
import ast.*;

import java.util.Objects;

public class ExpressionVisitor extends ReactParserBaseVisitor<Expression> {
    @Override
    public Expression visitParentheses(ReactParser.ParenthesesContext ctx) {
        return visit(ctx.expression());
    }

    @Override
    public FunctionCall visitFunctionCall(ReactParser.FunctionCallContext ctx) {
        Expression nameSpace = visit(ctx.expression());

        if(ctx.templateLiteral() != null) {
            var template = new TemplateLiteralVisitor().visit(ctx.templateLiteral());
            return new FunctionCall(nameSpace, template);
        }

        Param param = new Param();
        for (var exp : ctx.param().expression()) {
            param.addNewParameter(visit(exp));
        }

        return new FunctionCall(nameSpace, param);
    }

    @Override
    public MemberGet visitMemberGet(ReactParser.MemberGetContext ctx) {
        Expression parent = visit(ctx.expression());
        Notation notation = new NotationVisitor().visit(ctx.notation());

        return new MemberGet(parent, notation);
    }

    @Override
    public New visitNew(ReactParser.NewContext ctx) {
        Expression expression = visit(ctx.expression());

        if(ctx.param() != null) {
            Param param = new Param();
            for (var exp : ctx.param().expression()) {
                param.addNewParameter(visit(exp));
            }
            return new New(expression, param);
        }

        return new New(expression);
    }

    @Override
    public Incremental visitPostIncre(ReactParser.PostIncreContext ctx) {
        Expression exp = visit(ctx.expression());
        var incremental = new Incremental(exp);

        incremental.setPost(true);

        var sign = ctx.incrementsOp().getText();
        incremental.setIncrease(Objects.equals(sign, "++"));

        return incremental;
    }

    @Override
    public Incremental visitPreInc(ReactParser.PreIncContext ctx) {
        Expression exp = visit(ctx.expression());
        var incremental = new Incremental(exp);

        incremental.setPost(false);

        var sign = ctx.incrementsOp().getText();
        incremental.setIncrease(Objects.equals(sign, "++"));

        return incremental;
    }

    @Override
    public LogicalNot visitLogicalNOT(ReactParser.LogicalNOTContext ctx) {
        var exp = visit(ctx.expression());
        return new LogicalNot(exp);
    }

    @Override
    public Unary visitUnary(ReactParser.UnaryContext ctx) {
        var exp = visit(ctx.expression());
        var sign = ctx.unarysOp().getText();

        return new Unary(exp, sign);
    }

    @Override
    public Pow visitPow(ReactParser.PowContext ctx) {
        Expression left = visit(ctx.expression(0));
        Expression right = visit(ctx.expression(1));

        return new Pow(left, right);
    }

    @Override
    public Multiplication visitMult(ReactParser.MultContext ctx) {
        Expression left = visit(ctx.expression(0));
        String sign = ctx.multiplicativeOp().getText();
        Expression right = visit(ctx.expression(1));

        return new Multiplication(left, sign, right);
    }

    @Override
    public Addition visitAdd(ReactParser.AddContext ctx) {
        Expression left = visit(ctx.expression(0));
        String sign = ctx.additiveOp().getText();
        Expression right = visit(ctx.expression(1));

        return new Addition(left, sign, right);
    }

    @Override
    public Compare visitCompare(ReactParser.CompareContext ctx) {
        Expression left = visit(ctx.expression(0));
        String sign = ctx.compareOP().getText();
        Expression right = visit(ctx.expression(1));

        return new Compare(left, sign, right);
    }

    @Override
    public CompareWithEqual visitCompareWithEqual(ReactParser.CompareWithEqualContext ctx) {
        Expression left = visit(ctx.expression(0));
        String sign = ctx.equalCompareOP().getText();
        Expression right = visit(ctx.expression(1));

        return new CompareWithEqual(left, sign, right);
    }

    @Override
    public LogicalAnd visitLogicalAND(ReactParser.LogicalANDContext ctx) {
        Expression left = visit(ctx.expression(0));
        Expression right = visit(ctx.expression(1));

        return new LogicalAnd(left, right);
    }

    @Override
    public LogicalOr visitLogicalOR(ReactParser.LogicalORContext ctx) {
        Expression left = visit(ctx.expression(0));
        Expression right = visit(ctx.expression(1));

        return new LogicalOr(left, right);
    }

    @Override
    public LogicalNull visitLogicalNull(ReactParser.LogicalNullContext ctx) {
        Expression left = visit(ctx.expression(0));
        Expression right = visit(ctx.expression(1));

        return new LogicalNull(left, right);
    }

    @Override
    public TernaryOperator visitTernary(ReactParser.TernaryContext ctx) {
        Expression condition = visit(ctx.expression(0));
        Expression onTruth = visit(ctx.expression(1));
        Expression onFalse = visit(ctx.expression(2));

        return new TernaryOperator(condition, onTruth, onFalse);
    }

    @Override
    public Assignment visitAssignment(ReactParser.AssignmentContext ctx) {
        Expression left = visit(ctx.expression(0));
        String sign = ctx.assinmentOp().getText();
        Expression right = visit(ctx.expression(1));

        return new Assignment(left, sign, right);
    }

    @Override
    public ArraySpread visitArraySpread(ReactParser.ArraySpreadContext ctx) {
        Expression exp = visit(ctx.expression());
        return new ArraySpread(exp);
    }

    @Override
    public ValidName visitVariable(ReactParser.VariableContext ctx) {
        var name = ctx.validName().getText();
        return new ValidName(name);
    }

    @Override
    public Returnable visitValue(ReactParser.ValueContext ctx) {
        return new ReturnableVisitor().visit(ctx.returnable());
    }
}
