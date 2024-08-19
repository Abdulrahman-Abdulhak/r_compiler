package ast;

import symbolTable.VariableType;

import java.util.List;

public class PrimeType extends Returnable {
    VariableType variableType;
    Object value;

    public PrimeType(int value, int lineDefined) {
        super(lineDefined);
        this.value = value;
        variableType = VariableType.num;
    }
    public PrimeType(float value, int lineDefined) {
        super(lineDefined);
        this.value = value;
        variableType = VariableType.num;
    }
    public PrimeType(double value, int lineDefined) {
        super(lineDefined);
        this.value = value;
        variableType = VariableType.num;
    }
    public PrimeType(JsString str, int lineDefined) {
        super(lineDefined);
        value = str;
        variableType = VariableType.string;
    }
    public PrimeType(String str, int lineDefined) {
        super(lineDefined);
        value = str;
        variableType = VariableType.string;
    }
    public PrimeType(boolean bool, int lineDefined) {
        super(lineDefined);
        value = bool;
        variableType = VariableType.bool;
    }
    public PrimeType(JsNull nullVal, int lineDefined) {
        super(lineDefined);
        value = nullVal;
        variableType = VariableType.jsNull;
    }
    public PrimeType(int lineDefined) {
        super(lineDefined);
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
