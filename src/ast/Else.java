package ast;

import Util.ToString;

public class Else extends If {
    Block body;
    Line line;

    public Else(Block body, int lineDefined) {
        super(null, body, lineDefined);
        elseIfs = null;
    }

    public Else(Line line, int lineDefined) {
        super(null, line, lineDefined);
        elseIfs = null;
    }

    @Override
    String lineContent() {
        return ToString.self(
            "else",
            ToString.allNotNull(
                "body", body,
                "body", line
            )
        );
    }

    @Override
    public String nodeName() {
        return "Else";
    }
}
