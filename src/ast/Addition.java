package ast;

import errors.messages.ErrorMessage;
import symbolTable.SymbolTable;

import java.util.List;
import java.util.stream.Stream;

public class Addition extends LeftRightOperation {
    public Addition(Expression left, String sign, Expression right, int lineDefined, SymbolTable symbolTable) {
        super(left, sign, right, lineDefined, symbolTable);
    }
    public Addition(Expression left, boolean isPlus, Expression right, int lineDefined, SymbolTable symbolTable) {
        super(left, isPlus ? "+" : "-", right, lineDefined, symbolTable);
    }

    @Override
    String type() { return "Addition"; }

    @Override
    public String nodeName() {
        return "Add";
    }

    @Override
    public List<Node> childNodes() {
        return Stream.of(left, right).map(item -> (Node) item).toList();
    }
}
