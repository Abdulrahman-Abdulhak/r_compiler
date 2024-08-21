package ast;

import errors.messages.ErrorMessage;
import symbolTable.SymbolTable;

import java.util.List;
import java.util.stream.Stream;

public class TernaryOperator extends Expression {
    Expression condition, onTruth, onFalse;

    public TernaryOperator(Expression condition, Expression onTruth, Expression onFalse, int lineDefined, SymbolTable symbolTable) {
        super(lineDefined, symbolTable);
        this.condition = condition;
        this.onTruth = onTruth;
        this.onFalse= onFalse;
    }

    @Override
    String type() { return "TernaryOperator"; }

    @Override
    Object[] members() {
        return new Object[]{"condition", condition, "onTruth", onTruth, "onFalse", onFalse};
    }

    @Override
    public ErrorMessage errorMessage() {
        if(condition != null && condition.errorCheck()) return condition.errorMessage();
        if(onTruth != null && onTruth.errorCheck()) return onTruth.errorMessage();
        if(onFalse != null && onFalse.errorCheck()) return onFalse.errorMessage();
        return null;
    }

    @Override
    public boolean errorCheck() {
        return condition.errorCheck() || onTruth.errorCheck() || onFalse.errorCheck();
    }

    @Override
    public String nodeName() {
        return "Ternary Operator";
    }

    @Override
    public List<Node> childNodes() {
        return Stream.of(condition, onTruth, onFalse).map(item -> (Node) item).toList();
    }

    @Override
    public String generate() {
        return condition.generate() + " ? " + onTruth.generate() + " : " + onFalse.generate();
    }
}
