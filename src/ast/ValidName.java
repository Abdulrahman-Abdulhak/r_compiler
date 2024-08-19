package ast;

import java.util.List;

public class ValidName extends Expression {
    String identifier;

    public ValidName(String id, int lineDefined) {
        super(lineDefined);
        identifier = id;
    }

    public String getIdentifier() {
        return identifier;
    }

    @Override
    String type() { return "ValidName"; }

    @Override
    Object[] members() {
        return new Object[]{"identifier", identifier};
    }

    @Override
    public String nodeName() {
        return "Variable";
    }

    @Override
    public List<Node> childNodes() {
        return null;
    }
}
