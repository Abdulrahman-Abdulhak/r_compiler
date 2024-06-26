package ast;

import Util.ToString;

public class Return extends SpecialLine {
    Expression expression;
    public Return(Expression exp) {
        this.expression = exp;
    }

    @Override
    String lineContent() {
        return ToString.var("return", expression);
    }
}
