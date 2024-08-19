package ast;

import java.util.List;

public class ThisKeyword extends Returnable {
    public ThisKeyword(int lineDefined) {
        super(lineDefined);
    }

    @Override
    String type() { return "This Keyword"; }

    @Override
    Object[] members() {
        return new Object[0];
    }

    @Override
    public String nodeName() {
        return "Keyword:This";
    }

    @Override
    public List<Node> childNodes() {
        return null;
    }
}
