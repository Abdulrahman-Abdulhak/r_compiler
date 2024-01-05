package ast;

public class ArraySpread extends Expression {
    Expression array;

    public ArraySpread(Expression array) { this.array = array; }

    @Override
    String type() { return "ArraySpread"; }

    @Override
    Object[] members() {
        return new Object[]{"array", array};
    }
}
