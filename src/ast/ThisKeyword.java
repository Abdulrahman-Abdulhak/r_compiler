package ast;

public class ThisKeyword extends Returnable {
    public ThisKeyword() {}

    @Override
    String type() { return "This Keyword"; }

    @Override
    Object[] members() {
        return new Object[0];
    }
}
