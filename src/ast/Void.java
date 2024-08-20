package ast;

import java.util.List;
import java.util.stream.Stream;

public class Void extends Expression {
    Expression expression;

    public Void(Expression expression, int defineLine) {
        super(defineLine);
        this.expression = expression;
    }

    public Expression getExpression() {
        return expression;
    }
    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    @Override
    String type() {
        return "VoidOp";
    }

    @Override
    Object[] members() {
        return new Object[]{"expression", expression};
    }

    @Override
    public String nodeName() {
        return "Void Operator";
    }

    @Override
    public List<Node> childNodes() {
        return Stream.of(expression).map(item -> (Node) item).toList();
    }
}
