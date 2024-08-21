package ast;

import Util.ToString;
import errors.messages.ErrorMessage;
import symbolTable.SymbolTable;

import java.util.List;
import java.util.stream.Stream;

public class ObjectPropDefine extends Node {
    Object key;
    Expression value, destructuredObject;

    public ObjectPropDefine(int key, Expression value, int lineDefined, SymbolTable symbolTable) {
        super(lineDefined, symbolTable);
        this.key = key;
        this.value = value;
    }
    public ObjectPropDefine(float key, Expression value, int lineDefined, SymbolTable symbolTable) {
        super(lineDefined, symbolTable);
        this.key = key;
        this.value = value;
    }
    public ObjectPropDefine(double key, Expression value, int lineDefined, SymbolTable symbolTable) {
        super(lineDefined, symbolTable);
        this.key = key;
        this.value = value;
    }
    public ObjectPropDefine(String key, Expression value, int lineDefined, SymbolTable symbolTable) {
        super(lineDefined, symbolTable);
        this.key = key;
        this.value = value;
    }
    public ObjectPropDefine(ValidName key, Expression value, int lineDefined, SymbolTable symbolTable) {
        super(lineDefined, symbolTable);
        this.key = key;
        this.value = value;
    }
    public ObjectPropDefine(ValidName var, int lineDefined, SymbolTable symbolTable) {
        super(lineDefined, symbolTable);
        key = var;
        value = var;
    }
    public ObjectPropDefine(Method method, int lineDefined, SymbolTable symbolTable) {
        super(lineDefined, symbolTable);
        key = method.name;
        value = method;
    }
    public ObjectPropDefine(Expression computedKey, Expression value, int lineDefined, SymbolTable symbolTable) {
        super(lineDefined, symbolTable);
        key = computedKey;
        this.value = value;
    }
    public ObjectPropDefine(Expression destructuredObject, int lineDefined, SymbolTable symbolTable) {
        super(lineDefined, symbolTable);
        this.destructuredObject = destructuredObject;
    }

    @Override
    public String toString() {
        if (value instanceof Method) return value.toString();
        if (destructuredObject != null) {
            return ToString.self(
                    "ObjectProperty",
                    ToString.var("destructured-object", destructuredObject)
            );
        }
        return ToString.all("key", key, "value", value);
    }

    //    TODO: not finished
    @Override
    public ErrorMessage errorMessage() {
        return null;
    }

    @Override
    public boolean errorCheck() {
        return false;
    }

    @Override
    public String nodeName() {
        return "Object Property Definition";
    }

    @Override
    public List<Node> childNodes() {
        var useKey = key instanceof Expression ? (Expression) key : null;
        return Stream.of(useKey, value, destructuredObject).map(item -> (Node) item).toList();
    }

    @Override
    public String generate() {
        var isKeyNormal = key instanceof Integer || key instanceof Float || key instanceof Double || key instanceof String;

        if(isKeyNormal) return key + ": " + value.generate();
        if(key == value) return value.generate();
        if(value instanceof Method) return value.generate();
        if(key instanceof ValidName) return ((ValidName) key).generate() + ": " + value.generate();

        var isComputedKey = key instanceof Expression;
        if(isComputedKey) {
            return "[" + ((Expression) key).generate() + "]: " + value.generate();
        }

        return "..." + destructuredObject.generate();
    }
}
