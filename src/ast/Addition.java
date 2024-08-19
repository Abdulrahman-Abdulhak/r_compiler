package ast;

import java.util.List;
import java.util.stream.Stream;

public class Addition extends LeftRightOperation {
    public Addition(Expression left, String sign, Expression right) {
        super(left, sign, right);
    }
    public Addition(Expression left, boolean isPlus, Expression right) {
        super(left, isPlus ? "+" : "-", right);
    }

    @Override
    String type() { return "Addition"; }

    @Override
    public String nodeName() {
        return "Add";
    }

    @Override
    public List<Node> childNodes() {
        return Stream.of(left, right).map(item -> (Node) item).toList();
    }
}
