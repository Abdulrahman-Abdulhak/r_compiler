package ast;

import java.util.List;
import java.util.stream.Stream;

public class CompareWithEqual extends LeftRightOperation {
    public CompareWithEqual(Expression left, String sign, Expression right) {
        super(left, sign, right);
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
