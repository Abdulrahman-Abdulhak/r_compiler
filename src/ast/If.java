package ast;

import Util.ToString;

public class If extends Line {
    Expression test;
    Block body;
    Line line;

    public If(Expression test, Block body) {
        this.test = test;
        this.body = body;
    }
    public If(Expression test, Line line) {
        this.test = test;
        this.line = line;
    }

    public Expression getTest() {
        return test;
    }
    public void setTest(Expression test) {
        this.test = test;
    }

    public Block getBody() {
        return body;
    }
    public void setBody(Block body) {
        this.body = body;
    }

    public Line getLine() {
        return line;
    }
    public void setLine(Line line) {
        this.line = line;
    }

    @Override
    String lineContent() {
        return ToString.self(
            "if",
                ToString.allNotNull(
                    "condition", test,
                    "body", body,
                    "body", line
                )
        );
    }
}
