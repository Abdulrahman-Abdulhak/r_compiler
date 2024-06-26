package ast;

import Util.ToString;

public class Declarable {
    String varName;
    ArrayDestructuring arr;
    ObjectDestructuring obj;

    public Declarable(String varName) { this.varName = varName; }
    public Declarable(ObjectDestructuring obj) { this.obj = obj; }
    public Declarable(ArrayDestructuring arr) { this.arr = arr; }

    public String getVarName() {
        return varName;
    }

    public ArrayDestructuring getArr() {
        return arr;
    }

    public ObjectDestructuring getObj() {
        return obj;
    }

    @Override
    public String toString() {
        return ToString.allNotNull("new var", varName, "new var", arr, "new var", obj);
    }
}
