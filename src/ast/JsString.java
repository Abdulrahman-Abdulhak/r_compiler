package ast;

import Util.ToString;

import java.util.List;

public class JsString extends Node {
    String value;

    public JsString(String value) { this.value = value; }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public String nodeName() {
        return "String";
    }

    @Override
    public List<Node> childNodes() {
        return null;
    }
}
