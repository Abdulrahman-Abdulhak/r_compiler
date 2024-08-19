package ast;

import java.util.List;
import java.util.stream.Stream;

public class LogicalNot extends Expression {
    Expression expression;

    public LogicalNot(Expression exp, int lineDefined) {
        super(lineDefined);
        expression = exp;
    }

    @Override
    String type() { return "LogicalNot"; }

    @Override
    Object[] members() {
        return new Object[]{};
    }

    @Override
    public String nodeName() {
        return "Logical Not";
    }

    @Override
    public List<Node> childNodes() {
        return Stream.of(expression).map(item -> (Node) item).toList();
    }
}
