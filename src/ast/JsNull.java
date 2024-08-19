package ast;

import java.util.List;

public class JsNull extends Node {
    public JsNull(int lineDefined) {
        super(lineDefined);
    }

    @Override
    public String toString() {
        return "null";
    }


    @Override
    public String nodeName() {
        return "Null Value";
    }

    @Override
    public List<Node> childNodes() {
        return null;
    }
}
