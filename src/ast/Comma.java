package ast;

import symbolTable.SymbolTable;

import java.util.List;
import java.util.stream.Stream;

public class Comma extends LeftRightOperation {
    public Comma(Expression left, Expression right, int defineLine, SymbolTable symbolTable) {
        super(left, right, defineLine, symbolTable);
        sign = ",";
    }

    @Override
    String type() {
        return "CommaOperator";
    }

    @Override
    public String nodeName() {
        return "Comma Operator";
    }

    @Override
    public List<Node> childNodes() {
        return Stream.of(left, right).map(item -> (Node) item).toList();
    }
}
