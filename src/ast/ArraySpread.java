package ast;

import java.util.List;
import java.util.stream.Stream;

public class ArraySpread extends Expression {
    Expression array;

    public ArraySpread(Expression array) { this.array = array; }

    @Override
    String type() { return "ArraySpread"; }

    @Override
    Object[] members() {
        return new Object[]{"array", array};
    }

    @Override
    public String nodeName() {
        return "Array Spreading";
    }

    @Override
    public List<Node> childNodes() {
        return Stream.of(array).map(item -> (Node) item).toList();
    }
}
