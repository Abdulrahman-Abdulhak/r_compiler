package ast;

import Util.ToString;
import errors.messages.AlreadyDefined;
import errors.messages.ErrorMessage;
import symbolTable.SymbolTable;

import java.util.List;
import java.util.stream.Stream;

public class Declarable extends Node {
    String varName;
    ArrayDestructuring arr;
    ObjectDestructuring obj;

    public Declarable(String varName, int lineDefined, SymbolTable symbolTable) {
        super(lineDefined, symbolTable);
        this.varName = varName;
    }
    public Declarable(ObjectDestructuring obj, int lineDefined, SymbolTable symbolTable) {
        super(lineDefined, symbolTable);
        this.obj = obj;
    }
    public Declarable(ArrayDestructuring arr, int lineDefined, SymbolTable symbolTable) {
        super(lineDefined, symbolTable);
        this.arr = arr;
    }

    public String getVarName() { return varName; }

    public ArrayDestructuring getArr() { return arr; }

    public ObjectDestructuring getObj() { return obj; }

    @Override
    public String toString() {
        return ToString.allNotNull("new var", varName, "new var", arr, "new var", obj);
    }

    @Override
    public ErrorMessage errorMessage() {
        if(varName != null) return new AlreadyDefined(lineDefined);
        if(arr != null) return arr.errorMessage();
        return obj.errorMessage();
    }

    @Override
    public boolean errorCheck() {
        return varName != null && symbolTable.has(varName) || arr != null && arr.errorCheck() || obj != null && obj.errorCheck();
    }

    @Override
    public String nodeName() {
        return "Declarable";
    }

    @Override
    public List<Node> childNodes() {
        return Stream.of(arr, obj).toList();
    }

    @Override
    public String generate() {
        if(varName != null) return varName;
        if(arr != null) return arr.generate();
        return obj.generate();
    }
}
