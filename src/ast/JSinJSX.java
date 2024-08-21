package ast;

import symbolTable.SymbolTable;

import java.util.List;
import java.util.stream.Stream;

public class JSinJSX extends JSX {
    Expression expression;
    public JSinJSX(Expression expression, int lineDefined, SymbolTable symbolTable) {
        super((Expression) null, lineDefined, symbolTable);
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "JS in JSX: " + expression;
    }

    @Override
    public String nodeName() {
        return "JS In JSX";
    }

    @Override
    public List<Node> childNodes() {
        return Stream.of(expression).map(item -> (Node) item).toList();
    }

    @Override
    public String generate() {
        return expression.generate();
    }
}
