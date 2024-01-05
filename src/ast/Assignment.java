package ast;

public class Assignment extends LeftRightOperation {
    public Assignment(Expression assignable, String sign, Expression exp) {
        super(assignable, sign, exp);
    }

    @Override
    String type() { return "Assignment"; }
}
