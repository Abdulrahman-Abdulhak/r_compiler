package ast;

import java.util.List;

public class JsNull extends Node {
    public JsNull() {}

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
