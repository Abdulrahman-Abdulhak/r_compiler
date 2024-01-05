package ast;

public class Pow extends LeftRightOperation {
    public Pow(Expression left, Expression right) { super(left, right); }

    @Override
    String type() { return "Pow"; }
}
