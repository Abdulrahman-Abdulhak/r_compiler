package ast;

import errors.messages.ErrorMessage;
import symbolTable.SymbolTable;

import java.util.List;
import java.util.stream.Stream;

public class ArraySpread extends Expression {
    Expression array;

    public ArraySpread(Expression array, int lineDefined, SymbolTable symbolTable) {
        super(lineDefined, symbolTable);
        this.array = array;
    }

    @Override
    public ErrorMessage errorMessage() {
        return array.errorMessage();
    }

    @Override
    public boolean errorCheck() {
        return array.errorCheck();
    }

    @Override
    String type() { return "ArraySpread"; }

    @Override
    Object[] members() {
        return new Object[]{"array", array};
    }

    @Override
    public String nodeName() {
        return "Array Spreading";
    }

    @Override
    public List<Node> childNodes() {
        return Stream.of(array).map(item -> (Node) item).toList();
    }

    @Override
    public String generate() {
        return "..." + array.generate();
    }
}
