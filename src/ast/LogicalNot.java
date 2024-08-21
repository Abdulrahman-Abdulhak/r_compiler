package ast;

import errors.messages.ErrorMessage;
import symbolTable.SymbolTable;

import java.util.List;
import java.util.stream.Stream;

public class LogicalNot extends Expression {
    Expression expression;

    public LogicalNot(Expression exp, int lineDefined, SymbolTable symbolTable) {
        super(lineDefined, symbolTable);
        expression = exp;
    }

    @Override
    String type() { return "LogicalNot"; }

    @Override
    Object[] members() {
        return new Object[]{};
    }

    @Override
    public ErrorMessage errorMessage() {
        return expression.errorMessage();
    }

    @Override
    public boolean errorCheck() {
        return expression.errorCheck();
    }

    @Override
    public String nodeName() {
        return "Logical Not";
    }

    @Override
    public List<Node> childNodes() {
        return Stream.of(expression).map(item -> (Node) item).toList();
    }

    @Override
    public String generate() {
        return "!" + expression.generate();
    }
}
