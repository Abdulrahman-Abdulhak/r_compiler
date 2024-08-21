package ast;

import Util.ToString;
import errors.messages.ErrorMessage;
import symbolTable.SymbolTable;

import java.util.List;

public class JsString extends Node {
    String value;

    public JsString(String value, int lineDefined, SymbolTable symbolTable) {
        super(lineDefined, symbolTable);
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
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
        return "String";
    }

    @Override
    public List<Node> childNodes() {
        return null;
    }

    @Override
    public String generate() {
        return value;
    }
}
