package ast;

import Util.ToString;
import errors.messages.ErrorMessage;
import symbolTable.SymbolTable;

import java.util.List;
import java.util.stream.Stream;

public class While extends Line {
    Expression condition;
    Line line;
    Block body;

    public While(Expression condition, Block body, int lineDefined, SymbolTable symbolTable) {
        super(lineDefined, symbolTable);
        this.condition = condition;
        this.body = body;
    }
    public While(Expression condition, Line line, int lineDefined, SymbolTable symbolTable) {
        super(lineDefined, symbolTable);
        this.condition = condition;
        this.line = line;
    }

    @Override
    String lineContent() {
        return ToString.self(
            "while loop",
            ToString.allNotNull(
                "condition", condition,
                "body", body,
                "body", line
            )
        );
    }

    @Override
    public ErrorMessage errorMessage() {
        return condition.errorMessage();
    }

    @Override
    public boolean errorCheck() {
        return condition.errorCheck();
    }

    @Override
    public String nodeName() {
        return "While Loop";
    }

    @Override
    public List<Node> childNodes() {
        return Stream.of(condition, line, body).map(item -> (Node) item).toList();
    }

    @Override
    public String generate() {
        return "while (" + condition.generate() + ") " + (line != null ? line.generate() : body.generate());
    }
}
