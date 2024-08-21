package ast;

import errors.messages.ErrorMessage;

import java.util.List;

public class JsNull extends Node {
    public JsNull(int lineDefined) {
        super(lineDefined, null);
    }

    @Override
    public String toString() {
        return "null";
    }


    @Override
    public ErrorMessage errorMessage() {
        return null;
    }

    @Override
    public boolean errorCheck() {
        return false;
    }

    @Override
    public String nodeName() {
        return "Null Value";
    }

    @Override
    public List<Node> childNodes() {
        return null;
    }

    @Override
    public String generate() {
        return "null";
    }
}
