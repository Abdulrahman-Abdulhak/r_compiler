package ast;

import Util.ToString;

import java.util.List;
import java.util.stream.Stream;

public class DestructuredObjVar extends Node {
    Object key;
    ValidName var;
    Expression defaultValue;

    public DestructuredObjVar(ValidName var, int lineDefined) {
        super(lineDefined);
        this.var = var;
    }
    public DestructuredObjVar(Object key, ValidName var, int lineDefined) {
        super(lineDefined);
        this.key = key;
        this.var = var;
    }
    public DestructuredObjVar(ValidName var, Expression defaultValue, int lineDefined) {
        super(lineDefined);
        this.defaultValue = defaultValue;
        this.var = var;
    }
    public DestructuredObjVar(Object key, ValidName var, Expression defaultValue, int lineDefined) {
        super(lineDefined);
        this.key = key;
        this.var = var;
        this.defaultValue = defaultValue;
    }

    public ValidName getVar() {
        return var;
    }

    @Override
    public String toString() {
        return ToString.self(
            "Destructured-Object Var",
            ToString.allNotNull("original-key", key, "variable", var, "default-val", defaultValue)
        );
    }

    @Override
    public String nodeName() {
        return "Destructured Object Variable";
    }

    @Override
    public List<Node> childNodes() {
        return Stream.of(var, defaultValue).map(item -> (Node) item).toList();
    }
}
