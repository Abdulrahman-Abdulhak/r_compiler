package ast;

import errors.messages.ErrorMessage;
import symbolTable.SymbolTable;

import java.util.List;

public class ValidName extends Expression {
    String identifier;

    public ValidName(String id, int lineDefined, SymbolTable symbolTable) {
        super(lineDefined, symbolTable);
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
    public ErrorMessage errorMessage() {
        return null;
    }

    @Override
    public boolean errorCheck() {
        return false;
    }

    @Override
    public String nodeName() {
        return "Variable";
    }

    @Override
    public List<Node> childNodes() {
        return null;
    }

    @Override
    public String generate() {
        return identifier;
    }
}
