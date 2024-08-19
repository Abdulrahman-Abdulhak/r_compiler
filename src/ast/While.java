package ast;

import Util.ToString;

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
}
