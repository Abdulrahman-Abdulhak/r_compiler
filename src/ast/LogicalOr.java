package ast;

public class LogicalOr extends LeftRightOperation {
    public LogicalOr(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    String type() { return "LogicalOr"; }
}
