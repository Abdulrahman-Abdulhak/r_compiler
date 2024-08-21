package ast;

import Util.ToString;
import errors.messages.ErrorMessage;
import symbolTable.SymbolTable;

import java.util.List;

public class Return extends SpecialLine {
    Expression expression;

    public Return(int lineDefined, SymbolTable symbolTable) {
        this(null, lineDefined, symbolTable);
    }

    @Override
    public ErrorMessage errorMessage() {
        return expression.errorMessage();
    }

    @Override
    public boolean errorCheck() {
        return expression.errorCheck();
    }

    public Return(Expression exp, int lineDefined, SymbolTable symbolTable) {
        super(lineDefined, symbolTable);
        this.expression = exp;
    }

    @Override
    String lineContent() {
        return ToString.self("return", ToString.notNull("value", expression));
    }

    @Override
    public String nodeName() {
        return "null";
    }

    @Override
    public List<Node> childNodes() {
        return null;
    }

    @Override
    public String generate() {
        return "return " + expression.generate();
    }
}
