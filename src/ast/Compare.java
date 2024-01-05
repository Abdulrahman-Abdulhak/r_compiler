package ast;

public class Compare extends LeftRightOperation {
    public Compare(Expression left, String sign, Expression right) {
        super(left, sign, right);
    }

    @Override
    String type() { return "Compare"; }
}
