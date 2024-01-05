package ast;

public class CompareWithEqual extends LeftRightOperation {
    public CompareWithEqual(Expression left, String sign, Expression right) {
        super(left, sign, right);
    }

    @Override
    String type() { return "CompareWithEqual"; }
}
