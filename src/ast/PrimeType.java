package ast;

import symbolTable.VariableType;

import java.util.List;

public class PrimeType extends Returnable {
    VariableType variableType;
    Object value;

    public PrimeType(int value) {
        this.value = value;
        variableType = VariableType.num;
    }
    public PrimeType(float value) {
        this.value = value;
        variableType = VariableType.num;
    }
    public PrimeType(double value) {
        this.value = value;
        variableType = VariableType.num;
    }
    public PrimeType(JsString str) {
        value = str;
        variableType = VariableType.string;
    }
    public PrimeType(String str) {
        value = str;
        variableType = VariableType.string;
    }
    public PrimeType(boolean bool) {
        value = bool;
        variableType = VariableType.bool;
    }
    public PrimeType(JsNull nullVal) {
        value = nullVal;
        variableType = VariableType.jsNull;
    }
    public PrimeType() {
        value = null;
        variableType = VariableType.undefined;
    }

    @Override
    String type() { return "PrimeType"; }

    @Override
    Object[] members() {
        return new Object[]{"variableType", variableType.name(), "value", value};
    }

    public String valueString() {
        return switch (variableType) {
            case num, bool -> value.toString();
            case string -> value instanceof String ? value.toString() : ((JsString) value).value;
            case jsNull -> "null";
            case undefined -> "undefined";
        };
    }

    @Override
    public String nodeName() {
        return "Prime Type: " + valueString();
    }

    @Override
    public List<Node> childNodes() {
        return null;
    }
}
