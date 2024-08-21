package ast;

import Util.ToString;
import errors.messages.ErrorMessage;
import symbolTable.SymbolTable;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class If extends Line {
    Expression test;
    Block body;
    Line line;
    List<ElseIf> elseIfs;
    Else chainedElse;

    public If(Expression test, Block body, int lineDefined, SymbolTable symbolTable) {
        super(lineDefined, symbolTable);
        this.test = test;
        this.body = body;
        elseIfs = new ArrayList<>();
    }
    public If(Expression test, Line line, int lineDefined, SymbolTable symbolTable) {
        super(lineDefined, symbolTable);
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
    public ErrorMessage errorMessage() {
        if(test != null) return test.errorMessage();

        var errorElseIfs = elseIfs.stream().filter(Node::errorCheck).toList();
        var errorElseIf = errorElseIfs.isEmpty() ? null : errorElseIfs.getFirst();

        if(errorElseIf != null) return errorElseIf.errorMessage();
        return null;
    }

    @Override
    public boolean errorCheck() {
        return test.errorCheck() || elseIfs.stream().anyMatch(Node::errorCheck);
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

    private String elseIfsGenerate() {
        if(elseIfs == null || elseIfs.isEmpty()) return "";

        var str = new StringBuilder();

        for (var elseIf : elseIfs) {
            str.append(elseIf.generate());
        }

        return str.toString();
    }
    private String elseGenerate() {
        if(chainedElse == null) return "";
        return chainedElse.generate();
    }
    @Override
    public String generate() {
        var if_ = "if (" + test.generate() + ") " + (line != null ? (line.generate() + new NoUse().generate()) : body.generate());
        var elseIfs = elseIfsGenerate();
        var else_ = elseGenerate();

        return if_ + elseIfs + else_;
    }
}
