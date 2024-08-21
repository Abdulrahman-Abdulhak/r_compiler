package ast;

import Util.ToString;
import errors.messages.ErrorMessage;
import symbolTable.SymbolTable;

import java.util.List;
import java.util.stream.Stream;

public class For extends Line {
    Declare initDeclare;
    List<Expression> initExpressions, conditions, iterators;
    Line line;
    Block body;

    public For(Line line, int lineDefined, SymbolTable symbolTable) {
        this((Declare) null, null, null, line, lineDefined, symbolTable);
    }
    public For(Block body, int lineDefined, SymbolTable symbolTable) {
        this((Declare) null, null, null, body, lineDefined, symbolTable);
    }
    public For(Declare init, List<Expression> conditions, List<Expression> iterators, Line line, int lineDefined, SymbolTable symbolTable) {
        super(lineDefined, symbolTable);
        initDeclare = init;
        this.conditions = conditions;
        this.iterators = iterators;
        this.line = line;
    }
    public For(Declare init, List<Expression> conditions, List<Expression> iterators, Block body, int lineDefined, SymbolTable symbolTable) {
        super(lineDefined, symbolTable);
        initDeclare = init;
        this.conditions = conditions;
        this.iterators = iterators;
        this.body = body;
    }
    public For(List<Expression> init, List<Expression> conditions, List<Expression> iterators, Line line, int lineDefined, SymbolTable symbolTable) {
        super(lineDefined, symbolTable);
        initExpressions = init;
        this.conditions = conditions;
        this.iterators = iterators;
        this.line = line;
    }
    public For(List<Expression> init, List<Expression> conditions, List<Expression> iterators, Block body, int lineDefined, SymbolTable symbolTable) {
        super(lineDefined, symbolTable);
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
    public ErrorMessage errorMessage() {
        if(initDeclare != null) return initDeclare.errorMessage();

        var initExpressions = this.initExpressions.stream().filter(Node::errorCheck).toList();
        var initExpression = initExpressions.isEmpty() ? null : initExpressions.getFirst();

        if(initExpression != null) return initExpression.errorMessage();

        var conditions = this.conditions.stream().filter(Node::errorCheck).toList();
        var condition = conditions.isEmpty() ? null : conditions.getFirst();

        if(condition != null) return condition.errorMessage();

        var iterators = this.iterators.stream().filter(Node::errorCheck).toList();
        var iterator = iterators.isEmpty() ? null : iterators.getFirst();

        if(iterator != null) return iterator.errorMessage();
        return null;
    }

    @Override
    public boolean errorCheck() {
        return initDeclare.errorCheck() || conditions.stream().anyMatch(Node::errorCheck) || iterators.stream().anyMatch(Node::errorCheck) || initExpressions.stream().anyMatch(Node::errorCheck);
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

    private String generateExp1() {
        if(initDeclare != null) return initDeclare.generate();
        if(initExpressions == null || initExpressions.isEmpty()) return "";

        var str = new StringBuilder();
        for(var exp : initExpressions) {
            str.append(exp.generate());
            str.append(',');
        }
        str.replace(str.length() - 1, str.length(), "");

        return str.toString();
    }
    private String generateExp2() {
        if(conditions == null || conditions.isEmpty()) return "";

        var str = new StringBuilder();
        for(var exp : conditions) {
            str.append(exp.generate());
            str.append(',');
        }
        str.replace(str.length() - 1, str.length(), "");

        return str.toString();
    }
    private String generateExp3() {
        if(iterators == null || iterators.isEmpty()) return "";

        var str = new StringBuilder();
        for(var exp : iterators) {
            str.append(exp.generate());
            str.append(',');
        }
        str.replace(str.length() - 1, str.length(), "");

        return str.toString();
    }

    @Override
    public String generate() {
        return "for (" + generateExp1() + ";" + generateExp2() + ";" + generateExp2() + ")"
                + (line != null ? line.generate() + new NoUse().generate() : body.generate());
    }
}
