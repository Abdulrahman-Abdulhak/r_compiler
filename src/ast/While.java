package ast;

import Util.ToString;

import java.util.List;
import java.util.stream.Stream;

public class While extends Line {
    Expression condition;
    Line line;
    Block body;

    public While(Expression condition, Block body) {
        this.condition = condition;
        this.body = body;
    }
    public While(Expression condition, Line line) {
        this.condition = condition;
        this.line = line;
    }

    @Override
    String lineContent() {
        return ToString.self(
            "while loop",
            ToString.allNotNull(
                "condition", condition,
                "body", body,
                "body", line
            )
        );
    }

    @Override
    public String nodeName() {
        return "While Loop";
    }

    @Override
    public List<Node> childNodes() {
        return Stream.of(condition, line, body).map(item -> (Node) item).toList();
    }
}
