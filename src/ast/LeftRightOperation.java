package ast;

public abstract class LeftRightOperation extends Expression {
    Expression left, right;
    String sign;

    LeftRightOperation(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
    LeftRightOperation(Expression left, String sign, Expression right) {
        this.left = left;
        this.right = right;
        this.sign = sign;
    }

    @Override
    Object[] members() {
        return new Object[]{"left", left, "sign", sign, "right", right};
    }
}
