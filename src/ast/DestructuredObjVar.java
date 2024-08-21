package ast;

import Util.ToString;
import errors.messages.AlreadyDefined;
import errors.messages.ErrorMessage;
import symbolTable.SymbolTable;

import java.util.List;
import java.util.stream.Stream;

public class DestructuredObjVar extends Node {
    Object key;
    ValidName var;
    Expression defaultValue;

    public DestructuredObjVar(ValidName var, int lineDefined, SymbolTable symbolTable) {
        super(lineDefined, symbolTable);
        this.var = var;
    }
    public DestructuredObjVar(Object key, ValidName var, int lineDefined, SymbolTable symbolTable) {
        super(lineDefined, symbolTable);
        this.key = key;
        this.var = var;
    }
    public DestructuredObjVar(ValidName var, Expression defaultValue, int lineDefined, SymbolTable symbolTable) {
        super(lineDefined, symbolTable);
        this.defaultValue = defaultValue;
        this.var = var;
    }
    public DestructuredObjVar(Object key, ValidName var, Expression defaultValue, int lineDefined, SymbolTable symbolTable) {
        super(lineDefined, symbolTable);
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
    public ErrorMessage errorMessage() {
        if(symbolTable.has(var.identifier)) return new AlreadyDefined(lineDefined);
        return defaultValue.errorMessage();
    }

    @Override
    public boolean errorCheck() {
        return symbolTable.has(var.identifier) || defaultValue.errorCheck();
    }

    @Override
    public String nodeName() {
        return "Destructured Object Variable";
    }

    @Override
    public List<Node> childNodes() {
        return Stream.of(var, defaultValue).map(item -> (Node) item).toList();
    }

    @Override
    public String generate() {
        var defaultVal = defaultValue == null ? "" : "= " + defaultValue.generate();
        var keyGenerate = key == null ? "" : key + ": ";

        return keyGenerate + var.generate() + defaultVal;
    }
}
