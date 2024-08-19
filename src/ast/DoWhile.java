package ast;

import Util.ToString;

import java.util.List;
import java.util.stream.Stream;

public class DoWhile extends Line {
    Expression condition;
    Line line;
    Block body;

    public DoWhile(Expression condition, Block body) {
        this.condition = condition;
        this.body = body;
    }
    public DoWhile(Expression condition, Line line) {
        this.condition = condition;
        this.line = line;
    }

    @Override
    String lineContent() {
        return ToString.self(
                "do-while loop",
                ToString.allNotNull(
                        "condition", condition,
                        "body", body,
                        "body", line
                )
        );
    }

    @Override
    public String nodeName() {
        return "Do While Loop";
    }

    @Override
    public List<Node> childNodes() {
        return Stream.of(condition, line, body).map(item -> (Node) item).toList();
    }
}
