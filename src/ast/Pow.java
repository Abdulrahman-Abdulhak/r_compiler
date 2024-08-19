package ast;

import java.util.List;
import java.util.stream.Stream;

public class Pow extends LeftRightOperation {
    public Pow(Expression left, Expression right, int lineDefined) {
        super(left, right, lineDefined);
    }

    @Override
    String type() { return "Pow"; }

    @Override
    public String nodeName() {
        return "Power Operation";
    }

    @Override
    public List<Node> childNodes() {
        return Stream.of(left, right).map(item -> (Node) item).toList();
    }
}
