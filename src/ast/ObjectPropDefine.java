package ast;

import Util.ToString;

import java.util.List;
import java.util.stream.Stream;

public class ObjectPropDefine extends Node {
    Object key;
    Expression value, destructuredObject;

    public ObjectPropDefine(int key, Expression value, int lineDefined) {
        super(lineDefined);
        this.key = key;
        this.value = value;
    }
    public ObjectPropDefine(float key, Expression value, int lineDefined) {
        super(lineDefined);
        this.key = key;
        this.value = value;
    }
    public ObjectPropDefine(double key, Expression value, int lineDefined) {
        super(lineDefined);
        this.key = key;
        this.value = value;
    }
    public ObjectPropDefine(String key, Expression value, int lineDefined) {
        super(lineDefined);
        this.key = key;
        this.value = value;
    }
    public ObjectPropDefine(ValidName key, Expression value, int lineDefined) {
        super(lineDefined);
        this.key = key;
        this.value = value;
    }
    public ObjectPropDefine(ValidName var, int lineDefined) {
        super(lineDefined);
        key = var;
        value = var;
    }
    public ObjectPropDefine(Method method, int lineDefined) {
        super(lineDefined);
        key = method.name;
        value = method;
    }
    public ObjectPropDefine(Expression computedKey, Expression value, int lineDefined) {
        super(lineDefined);
        key = computedKey;
        this.value = value;
    }
    public ObjectPropDefine(Expression destructuredObject, int lineDefined) {
        super(lineDefined);
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

    @Override
    public String nodeName() {
        return "Object Property Definition";
    }

    @Override
    public List<Node> childNodes() {
        var useKey = key instanceof Expression ? (Expression) key : null;
        return Stream.of(useKey, value, destructuredObject).map(item -> (Node) item).toList();
    }
}
