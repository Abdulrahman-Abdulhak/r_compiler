package ast;

import symbolTable.SymbolTable;

import java.util.List;
import java.util.stream.Stream;

public class LogicalOr extends LeftRightOperation {
    public LogicalOr(Expression left, Expression right, int lineDefined, SymbolTable symbolTable) {
        super(left, right, lineDefined, symbolTable);
        sign = "||";
    }

    @Override
    String type() { return "LogicalOr"; }

    @Override
    public String nodeName() {
        return "Logical Or";
    }

    @Override
    public List<Node> childNodes() {
        return Stream.of(left, right).map(item -> (Node) item).toList();
    }
}
