package ast;

import errors.messages.ErrorMessage;
import symbolTable.SymbolTable;

import java.util.List;
import java.util.stream.Stream;

public class TypeOf extends Expression {
    Expression value;

    public TypeOf(Expression value, int defineLine, SymbolTable symbolTable) {
        super(defineLine, symbolTable);
        this.value = value;
    }

    @Override
    String type() {
        return "TypeOf";
    }

    @Override
    Object[] members() {
        return new Object[]{"value", value};
    }

    @Override
    public ErrorMessage errorMessage() {
        return value.errorMessage();
    }

    @Override
    public boolean errorCheck() {
        return value.errorCheck();
    }

    @Override
    public String nodeName() {
        return "Type OF";
    }

    @Override
    public List<Node> childNodes() {
        return Stream.of(value).map(item -> (Node) item).toList();
    }

    @Override
    public String generate() {
        return "typeof " + value.generate();
    }
}
