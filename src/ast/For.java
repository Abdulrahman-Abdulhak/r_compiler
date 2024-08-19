package ast;

import Util.ToString;

import java.util.List;
import java.util.stream.Stream;

public class For extends Line {
    Declare initDeclare;
    List<Expression> initExpressions, conditions, iterators;
    Line line;
    Block body;

    public For(Line line, int lineDefined) {
        this((Declare) null, null, null, line, lineDefined);
    }
    public For(Block body, int lineDefined) {
        this((Declare) null, null, null, body, lineDefined);
    }
    public For(Declare init, List<Expression> conditions, List<Expression> iterators, Line line, int lineDefined) {
        super(lineDefined);
        initDeclare = init;
        this.conditions = conditions;
        this.iterators = iterators;
        this.line = line;
    }
    public For(Declare init, List<Expression> conditions, List<Expression> iterators, Block body, int lineDefined) {
        super(lineDefined);
        initDeclare = init;
        this.conditions = conditions;
        this.iterators = iterators;
        this.body = body;
    }
    public For(List<Expression> init, List<Expression> conditions, List<Expression> iterators, Line line, int lineDefined) {
        super(lineDefined);
        initExpressions = init;
        this.conditions = conditions;
        this.iterators = iterators;
        this.line = line;
    }
    public For(List<Expression> init, List<Expression> conditions, List<Expression> iterators, Block body, int lineDefined) {
        super(lineDefined);
        initExpressions = init;
        this.conditions = conditions;
        this.iterators = iterators;
        this.body = body;
    }

    public Declare getInitDeclare() {
        return initDeclare;
    }
    public void setInitDeclare(Declare initDeclare) {
        this.initDeclare = initDeclare;
    }

    public List<Expression> getConditions() {
        return conditions;
    }
    public void setConditions(List<Expression> conditions) {
        this.conditions = conditions;
    }

    public List<Expression> getInitExpressions() {
        return initExpressions;
    }
    public void setInitExpressions(List<Expression> initExpressions) {
        this.initExpressions = initExpressions;
    }

    public List<Expression> getIterators() {
        return iterators;
    }
    public void setIterators(List<Expression> iterators) {
        this.iterators = iterators;
    }

    @Override
    String lineContent() {
        return ToString.self(
            "for Loop",
                ToString.allNotNull(
                    "init", initDeclare,
                    "init", initExpressions,
                    "conditions", conditions,
                    "iterators", iterators,
                    "body", line,
                    "body", body
                )
        );
    }

    @Override
    public String nodeName() {
        return "For Loop";
    }

    @Override
    public List<Node> childNodes() {
        var children = Stream.of(initDeclare, initExpressions, conditions, iterators, line, body);
        return children.map(item -> (Node) item).toList();
    }
}
