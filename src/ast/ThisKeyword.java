package ast;

import errors.messages.ErrorMessage;
import symbolTable.SymbolTable;

import java.util.List;

public class ThisKeyword extends Returnable {
    public ThisKeyword(int lineDefined, SymbolTable symbolTable) {
        super(lineDefined, symbolTable);
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

    @Override
    public String generate() {
        return "this";
    }
}
