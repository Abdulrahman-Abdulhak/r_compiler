package ast;

import java.util.List;
import java.util.stream.Stream;

public class LogicalAnd extends LeftRightOperation {
    public LogicalAnd(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    String type() { return "LogicalAnd"; }

    @Override
    public String nodeName() {
        return "Logical And";
    }

    @Override
    public List<Node> childNodes() {
        return Stream.of(left, right).map(item -> (Node) item).toList();
    }
}
