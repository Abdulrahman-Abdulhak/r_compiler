package ast;

public class TernaryOperator extends Expression {
    Expression condition, onTruth, onFalse;

    public TernaryOperator(Expression condition, Expression onTruth, Expression onFalse) {
        this.condition = condition;
        this.onTruth = onTruth;
        this.onFalse= onFalse;
    }

    @Override
    String type() { return "TernaryOperator"; }

    @Override
    Object[] members() {
        return new Object[]{"condition", condition, "onTruth", onTruth, "onFalse", onFalse};
    }
}
