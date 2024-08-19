package ast;

import java.util.List;

public class NoUse extends Statement {
    public NoUse(int lineDefined){
        super(lineDefined);
    }

    @Override
    String lineContent() { return null; }

    @Override
    public String toString() {
        return "";
    }

    @Override
    public String nodeName() {
        return null;
    }

    @Override
    public List<Node> childNodes() {
        return null;
    }
}
