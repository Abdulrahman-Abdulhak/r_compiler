package ast;

import java.util.HashMap;
import java.util.Map;

public class ArrayDestructuring {
    Map<Object, Object> varWithDefault;

    public ArrayDestructuring() {
        varWithDefault = new HashMap<>();
    }

    public void addVar(ValidName var) {
        varWithDefault.put(var.identifier, null);
    }
    public void addVar(ValidName var, Expression exp) {
        varWithDefault.put(var.identifier, exp);
    }

    @Override
    public String toString() {
        return  "array destructuring: " + "var : defaultValue" + "\n" + ToString.map(varWithDefault);
    }
}
