package ast;

import Util.ToString;
import errors.messages.ErrorMessage;
import symbolTable.SymbolTable;

import java.util.ArrayList;
import java.util.List;

public class ObjectDestructuring extends Node {
    List<DestructuredObjVar> vars;

    public ObjectDestructuring(int lineDefined, SymbolTable symbolTable) {
        super(lineDefined, symbolTable);
        vars = new ArrayList<>();
    }

    @Override
    public ErrorMessage errorMessage() {
        var errorVars = vars.stream().filter(Node::errorCheck).toList();
        var errorVar = errorVars.isEmpty() ? null : errorVars.getFirst();

        if(errorVar != null) return errorVar.errorMessage();
        return null;
    }

    @Override
    public boolean errorCheck() {
        return vars.stream().anyMatch(Node::errorCheck);
    }

    public void addVar(DestructuredObjVar var) { vars.add(var); }

    public List<DestructuredObjVar> getVars() {
        return vars;
    }

    @Override
    public String toString() {
        return ToString.self(
                "Object Destructuring",
                ToString.var("vars", vars)
        );
    }

    @Override
    public String nodeName() {
        return "Object Destructuring";
    }

    @Override
    public List<Node> childNodes() {
        return vars.stream().map(item -> (Node) item).toList();
    }

    @Override
    public String generate() {
        if(vars == null || vars.isEmpty()) return "{}";

        var str = new StringBuilder("{");

        for (var var : vars) {
            str.append(var.generate());
            str.append(",");
        }
        str.replace(str.length() - 1, str.length(), "");
        str.append("}");

        return str.toString();
    }
}
