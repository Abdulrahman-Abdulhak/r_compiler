package ast;

import Util.ToString;

public class ObjectPropDefine {
    Object key;
    Expression value, destructuredObject;

    public ObjectPropDefine(int key, Expression value) {
        this.key = key;
        this.value = value;
    }
    public ObjectPropDefine(float key, Expression value) {
        this.key = key;
        this.value = value;
    }
    public ObjectPropDefine(double key, Expression value) {
        this.key = key;
        this.value = value;
    }
    public ObjectPropDefine(String key, Expression value) {
        this.key = key;
        this.value = value;
    }
    public ObjectPropDefine(ValidName key, Expression value) {
        this.key = key.identifier;
        this.value = value;
    }
    public ObjectPropDefine(ValidName var) {
        key = var.identifier;
        value = var;
    }
    public ObjectPropDefine(Method method) {
        key = method.name;
        value = method;
    }
    public ObjectPropDefine(Expression computedKey, Expression value) {
        key = computedKey;
        this.value = value;
    }
    public ObjectPropDefine(Expression destructuredObject) {
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
}
