package ast;

public class LogicalAnd extends LeftRightOperation {
    public LogicalAnd(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    String type() { return "LogicalAnd"; }
}
