package ast;

import Util.ToString;

import java.util.ArrayList;
import java.util.List;

public class ObjectDestructuring extends Node {
    List<DestructuredObjVar> vars;

    public ObjectDestructuring(int lineDefined) {
        super(lineDefined);
        vars = new ArrayList<>();
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
}
