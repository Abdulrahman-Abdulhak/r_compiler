package ast;

import symbolTable.SymbolTable;

import java.util.List;
import java.util.stream.Stream;

public class CompareWithEqual extends LeftRightOperation {
    public CompareWithEqual(Expression left, String sign, Expression right, int lineDefined, SymbolTable symbolTable) {
        super(left, sign, right, lineDefined, symbolTable);
    }

    @Override
    String type() { return "CompareWithEqual"; }

    @Override
    public String nodeName() {
        return "Equality Comparison " + sign;
    }

    @Override
    public List<Node> childNodes() {
        return Stream.of(left, right).map(item -> (Node) item).toList();
    }
}
