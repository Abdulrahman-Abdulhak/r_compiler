package ast;

import Util.ToString;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayDestructuring extends Node {
    Map<Object, Object> varWithDefault;

    public ArrayDestructuring(int lineDefined) {
        super(lineDefined);
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
        var vars = varWithDefault.keySet();
        return vars.stream().map(key -> (Node) new ValidName(key + "", lineDefined)).toList();
    }
}
