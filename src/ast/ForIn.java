package ast;

import Util.ToString;

import java.util.List;
import java.util.stream.Stream;

public class ForIn extends Line {
    ValidName variable;
    Expression iterable;
    Line line;
    Block body;

    public ForIn(ValidName variable, Expression iterable, int lineDefined) {
        super(lineDefined);
        this.variable = variable;
        this.iterable = iterable;
    }
    public ForIn(ValidName variable, Expression iterable, Line line, int lineDefined) {
        this(variable, iterable, lineDefined);
        this.line = line;
    }
    public ForIn(ValidName variable, Expression iterable, Block body, int lineDefined) {
        this(variable, iterable, lineDefined);
        this.body = body;
    }

    @Override
    String lineContent() {
        return ToString.self(
            "for-in Loop",
            ToString.allNotNull(
                "variable", variable,
                "iterable", iterable,
                "body", line,
                "body", body
            )
        );
    }

    @Override
    public String nodeName() {
        return "For-In Loop";
    }

    @Override
    public List<Node> childNodes() {
        return Stream.of(variable, iterable, line, body).map(item -> (Node) item).toList();
    }
}
