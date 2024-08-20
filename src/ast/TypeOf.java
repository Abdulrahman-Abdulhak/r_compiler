package ast;

import java.util.List;
import java.util.stream.Stream;

public class TypeOf extends Expression {
    Expression value;

    public TypeOf(Expression value, int defineLine) {
        super(defineLine);
        this.value = value;
    }

    @Override
    String type() {
        return "TypeOf";
    }

    @Override
    Object[] members() {
        return new Object[]{"value", value};
    }

    @Override
    public String nodeName() {
        return "Type OF";
    }

    @Override
    public List<Node> childNodes() {
        return Stream.of(value).map(item -> (Node) item).toList();
    }
}
