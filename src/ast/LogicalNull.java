package ast;

import symbolTable.SymbolTable;

import java.util.List;
import java.util.stream.Stream;

public class LogicalNull extends LeftRightOperation {
    public LogicalNull(Expression left, Expression right, int lineDefined, SymbolTable symbolTable) {
        super(left, right, lineDefined, symbolTable);
        sign = "??";
    }

    @Override
    String type() { return "LogicalNull"; }

    @Override
    public String nodeName() {
        return "Logical Null-Check";
    }

    @Override
    public List<Node> childNodes() {
        return Stream.of(left, right).map(item -> (Node) item).toList();
    }
}
