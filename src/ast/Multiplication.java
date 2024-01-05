package ast;

public class Multiplication extends LeftRightOperation {
        public Multiplication(Expression left, String sign, Expression right) {
                super(left, sign, right);
        }
        public Multiplication(Expression left, boolean isMult, Expression right) {
                super(left, isMult ? "*" : "/", right);
        }

        @Override
        String type() { return "Multiplication"; }
}
