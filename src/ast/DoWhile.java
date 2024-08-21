package ast;

import Util.ToString;
import errors.messages.ErrorMessage;
import symbolTable.SymbolTable;

import java.util.List;
import java.util.stream.Stream;

public class DoWhile extends Line {
    Expression condition;
    Block body;

    public DoWhile(Expression condition, Block body, int lineDefined, SymbolTable symbolTable) {
        super(lineDefined, symbolTable);
        this.condition = condition;
        this.body = body;
    }

    @Override
    String lineContent() {
        return ToString.self(
            "do-while loop",
            ToString.allNotNull(
                "condition", condition,
                "body", body
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
        return "Do While Loop";
    }

    @Override
    public List<Node> childNodes() {
        return Stream.of(condition, body).map(item -> (Node) item).toList();
    }

    @Override
    public String generate() {
        return "do " + body.generate() + " while (" + condition.generate() + ")";
    }
}
