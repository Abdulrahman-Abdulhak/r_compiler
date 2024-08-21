package ast;

import Util.ToString;
import errors.messages.ErrorMessage;
import symbolTable.SymbolTable;

import java.util.List;
import java.util.stream.Stream;

public class Arg extends Node {
    ValidName name;
    ObjectDestructuring obj;
    ArrayDestructuring arr;

    public Arg(ValidName name, int lineDefined, SymbolTable symbolTable) {
        super(lineDefined, symbolTable);
        this.name = name;
    }
    public Arg(ObjectDestructuring obj, int lineDefined, SymbolTable symbolTable) {
        super(lineDefined, symbolTable);
        this.obj = obj;
    }
    public Arg(ArrayDestructuring arr, int lineDefined, SymbolTable symbolTable) {
        super(lineDefined, symbolTable);
        this.arr = arr;
    }

    @Override
    public ErrorMessage errorMessage() {
        return null;
    }

    @Override
    public boolean errorCheck() {
        return false;
    }

    @Override
    public String toString() {
        return ToString.self(
            "arg",
            ToString.allNotNull("var", name, "vars", obj, "vars", arr)
        );
    }

    @Override
    public String nodeName() {
        return "Argument";
    }

    @Override
    public List<Node> childNodes() {
        return Stream.of(name, obj, arr).toList();
    }

    @Override
    public String generate() {
        if(name != null) return name.generate();
        if(arr != null) return arr.generate();
        return obj.generate();
    }
}
