package ast;

import Util.ToString;

public class ElseIf extends If {
    public ElseIf(Expression test, Block body, int lineDefined) {
        super(test, body, lineDefined);
        elseIfs = null;
    }

    public ElseIf(Expression test, Line line, int lineDefined) {
        super(test, line, lineDefined);
        elseIfs = null;
    }

    @Override
    String lineContent() {
        return ToString.self(
            "elseIf",
            ToString.allNotNull(
                "condition", test,
                "body", body,
                "body", line
            )
        );
    }

    @Override
    public String nodeName() {
        return "Else If";
    }
}
