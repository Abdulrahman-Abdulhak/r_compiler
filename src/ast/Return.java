package ast;

import Util.ToString;

public class Return extends SpecialLine {
    Expression expression;

    public Return() {
        this(null);
    }
    public Return(Expression exp) {
        this.expression = exp;
    }

    @Override
    String lineContent() {
        return ToString.self("return", ToString.notNull("value", expression));
    }
}
