package ast;

import java.util.List;
import java.util.stream.Stream;

public class Addition extends LeftRightOperation {
    public Addition(Expression left, String sign, Expression right, int lineDefined) {
        super(left, sign, right, lineDefined);
    }
    public Addition(Expression left, boolean isPlus, Expression right, int lineDefined) {
        super(left, isPlus ? "+" : "-", right, lineDefined);
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
