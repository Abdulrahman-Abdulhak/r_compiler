package ast;

import Util.ToString;

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
}
