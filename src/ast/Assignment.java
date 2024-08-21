package ast;

import symbolTable.SymbolTable;

import java.util.List;
import java.util.stream.Stream;

public class Assignment extends LeftRightOperation {
    public Assignment(Expression assignable, String sign, Expression exp, int lineDefined, SymbolTable symbolTable) {
        super(assignable, sign, exp, lineDefined, symbolTable);
    }

    @Override
    String type() { return "Assignment"; }

    @Override
    public String nodeName() {
        return "Assignment " + sign;
    }

    @Override
    public List<Node> childNodes() {
        return Stream.of(left, right).map(item -> (Node) item).toList();
    }
}
