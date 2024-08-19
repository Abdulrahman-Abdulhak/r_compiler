package ast;

import Util.ToString;

public class ForOf extends Line {
    ValidName variable;
    Expression iterable;
    Line line;
    Block body;

    public ForOf(ValidName variable, Expression iterable) {
        this.variable = variable;
        this.iterable = iterable;
    }
    public ForOf(ValidName variable, Expression iterable, Line line) {
        this(variable, iterable);
        this.line = line;
    }
    public ForOf(ValidName variable, Expression iterable, Block body) {
        this(variable, iterable);
        this.body = body;
    }

    @Override
    String lineContent() {
        return ToString.self(
            "for-of Loop",
            ToString.allNotNull(
                "variable", variable,
                "iterable", iterable,
                "body", line,
                "body", body
            )
        );
    }
}
