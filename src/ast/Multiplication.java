package ast;

public class Multiplication extends LeftRightOperation {
        public Multiplication(Expression left, String sign, Expression right) {
                super(left, sign, right);
        }

        @Override
        String type() { return "Multiplication"; }
}
