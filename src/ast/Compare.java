package ast;

import java.util.List;
import java.util.stream.Stream;

public class Compare extends LeftRightOperation {
    public Compare(Expression left, String sign, Expression right, int lineDefined) {
        super(left, sign, right, lineDefined);
    }

    @Override
    String type() { return "Compare"; }

    @Override
    public String nodeName() {
        return "Comparison " + sign;
    }

    @Override
    public List<Node> childNodes() {
        return Stream.of(left, right).map(item -> (Node) item).toList();
    }
}
