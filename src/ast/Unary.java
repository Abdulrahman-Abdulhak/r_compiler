package ast;

import java.util.Objects;

public class Unary extends Expression {
    String sign;
    Expression expression;

    public Unary(Expression expression, boolean isPlus) {
        this.expression = expression;
        this.sign = isPlus ? "+" : "-";
    }
    public Unary(Expression expression, String sign) {
        this.expression = expression;
        this.sign = sign;
    }

    private String subType() { return ':' + sign; }

    @Override
    String type() { return "Unary" + subType(); }

    @Override
    Object[] members() {
        return new Object[]{"expression", expression, "operator", sign};
    }
}
