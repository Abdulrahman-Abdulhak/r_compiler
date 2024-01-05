package ast;

public class LogicalNull extends LeftRightOperation {
    public LogicalNull(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    String type() { return "LogicalNull"; }
}
