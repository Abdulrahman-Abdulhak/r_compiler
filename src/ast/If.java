package ast;

import Util.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class If extends Line {
    Expression test;
    Block body;
    Line line;
    List<ElseIf> elseIfs;
    Else chainedElse;

    public If(Expression test, Block body, int lineDefined) {
        super(lineDefined);
        this.test = test;
        this.body = body;
        elseIfs = new ArrayList<>();
    }
    public If(Expression test, Line line, int lineDefined) {
        super(lineDefined);
        this.test = test;
        this.line = line;
        elseIfs = new ArrayList<>();
    }

    public Else getChainedElse() {
        return chainedElse;
    }
    public void setChainedElse(Else chainedElse) {
        this.chainedElse = chainedElse;
    }

    public void addElseIf(ElseIf elseIf) {
        elseIfs.add(elseIf);
    }

    public List<ElseIf> getElseIfs() {
        return elseIfs;
    }
    public void setElseIfs(List<ElseIf> elseIfs) {
        this.elseIfs = elseIfs;
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
                    "body", line,
                    "else-ifs", elseIfs
                )
        );
    }

    @Override
    public String nodeName() {
        return "If";
    }

    @Override
    public List<Node> childNodes() {
        var children = new ArrayList<Node>();
        children.add(test);
        children.add(body);
        children.add(line);
        children.addAll(elseIfs == null ? List.of() : elseIfs);

        return children;
    }
}
