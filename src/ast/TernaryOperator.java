package ast;

import java.util.List;
import java.util.stream.Stream;

public class TernaryOperator extends Expression {
    Expression condition, onTruth, onFalse;

    public TernaryOperator(Expression condition, Expression onTruth, Expression onFalse) {
        this.condition = condition;
        this.onTruth = onTruth;
        this.onFalse= onFalse;
    }

    @Override
    String type() { return "TernaryOperator"; }

    @Override
    Object[] members() {
        return new Object[]{"condition", condition, "onTruth", onTruth, "onFalse", onFalse};
    }

    @Override
    public String nodeName() {
        return "Ternary Operator";
    }

    @Override
    public List<Node> childNodes() {
        return Stream.of(condition, onTruth, onFalse).map(item -> (Node) item).toList();
    }
}
