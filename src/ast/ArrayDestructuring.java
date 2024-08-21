package ast;

import Util.ToString;
import errors.messages.AlreadyDefined;
import errors.messages.ErrorMessage;
import symbolTable.SymbolTable;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayDestructuring extends Node {
    Map<Object, Object> varWithDefault;

    public ArrayDestructuring(int lineDefined, SymbolTable symbolTable) {
        super(lineDefined, symbolTable);
        varWithDefault = new HashMap<>();
    }

    public void addVar(ValidName var) {
        varWithDefault.put(var.identifier, null);
    }
    public void addVar(ValidName var, Expression exp) {
        varWithDefault.put(var.identifier, exp);
    }

    public Map<Object, Object> getVarWithDefault() {
        return varWithDefault;
    }

    public List<String> props() {
        return varWithDefault.keySet().stream().map(Object::toString).toList();
    }

    public List<Expression> values() {
        return varWithDefault.values().stream().map(item -> (Expression) item).toList();
    }

    @Override
    public ErrorMessage errorMessage() {
        var errorProps = props().stream().filter(prop -> symbolTable.has(prop)).toList();
        var errorProp = errorProps.isEmpty() ? null : errorProps.getFirst();

        if(errorProp != null) return new AlreadyDefined(lineDefined);

        var errorValues = values().stream().filter(Node::errorCheck).toList();
        var errorValue = errorValues.isEmpty() ? null : errorValues.getFirst();

        if(errorValue == null) return null;
        return errorValue.errorMessage();
    }

    @Override
    public boolean errorCheck() {
        return props().stream().anyMatch(prop -> symbolTable.has(prop)) || values().stream().anyMatch(Node::errorCheck);
    }

    @Override
    public String toString() {
        return  "array destructuring: " + "var : defaultValue" + "\n" + ToString.map(varWithDefault);
    }

    @Override
    public String nodeName() {
        return "Array Destructuring";
    }

    @Override
    public List<Node> childNodes() {
        return props().stream().map(item -> (Node) new ValidName(item, lineDefined, symbolTable)).toList();
    }

    private String varsGenerate() {
        if(varWithDefault.isEmpty()) return "";

        var str = new StringBuilder();
        for(var var : varWithDefault.entrySet()) {
            str.append(var.getKey());
            if(var.getValue() != null) {
                str.append(" = ");
                str.append(((Expression) var.getValue()).generate());
            }
            str.append(",");
        }
        str.replace(str.length() - 1, str.length(), "");

        return str.toString();
    }
    @Override
    public String generate() {
        return "[" + varsGenerate() + "]";
    }
}
