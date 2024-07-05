package ast;

import Util.ToString;

public class Declarable {
    Integer lineNumber;
    String varName;
    ArrayDestructuring arr;
    ObjectDestructuring obj;

    public Declarable(String varName, Integer lineNumber) {
        this.varName = varName;
        this.lineNumber = lineNumber;
    }
    public Declarable(ObjectDestructuring obj, Integer lineNumber) {
        this.obj = obj;
        this.lineNumber = lineNumber;
    }
    public Declarable(ArrayDestructuring arr, Integer lineNumber) {
        this.arr = arr;
        this.lineNumber = lineNumber;
    }

    public Integer getLineNumber() { return lineNumber; }

    public String getVarName() { return varName; }

    public ArrayDestructuring getArr() { return arr; }

    public ObjectDestructuring getObj() { return obj; }

    @Override
    public String toString() {
        return ToString.allNotNull("new var", varName, "new var", arr, "new var", obj);
    }
}
