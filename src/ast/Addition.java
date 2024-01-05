package ast;

public class Addition extends LeftRightOperation {
    public Addition(Expression left, String sign, Expression right) {
        super(left, sign, right);
    }
    public Addition(Expression left, boolean isPlus, Expression right) {
        super(left, isPlus ? "+" : "-", right);
    }

    @Override
    String type() { return "Addition"; }
}
