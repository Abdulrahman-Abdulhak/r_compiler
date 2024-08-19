package ast;

import Util.ToString;

import java.util.List;

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

    @Override
    public String nodeName() {
        return "null";
    }

    @Override
    public List<Node> childNodes() {
        return null;
    }
}
