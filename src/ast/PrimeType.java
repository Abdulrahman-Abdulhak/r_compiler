package ast;

import errors.messages.ErrorMessage;
import symbolTable.VariableType;

import java.util.List;

public class PrimeType extends Returnable {
    VariableType variableType;
    Object value;

    public PrimeType(int value, int lineDefined) {
        super(lineDefined, null);
        this.value = value;
        variableType = VariableType.num;
    }
    public PrimeType(float value, int lineDefined) {
        super(lineDefined, null);
        this.value = value;
        variableType = VariableType.num;
    }
    public PrimeType(double value, int lineDefined) {
        super(lineDefined, null);
        this.value = value;
        variableType = VariableType.num;
    }
    public PrimeType(JsString str, int lineDefined) {
        super(lineDefined, null);
        value = str;
        variableType = VariableType.string;
    }
    public PrimeType(String str, int lineDefined) {
        super(lineDefined, null);
        value = str;
        variableType = VariableType.string;
    }
    public PrimeType(boolean bool, int lineDefined) {
        super(lineDefined, null);
        value = bool;
        variableType = VariableType.bool;
    }
    public PrimeType(JsNull nullVal, int lineDefined) {
        super(lineDefined, null);
        value = nullVal;
        variableType = VariableType.jsNull;
    }
    public PrimeType(int lineDefined) {
        super(lineDefined, null);
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
    public ErrorMessage errorMessage() {
        return null;
    }

    @Override
    public boolean errorCheck() {
        return false;
    }

    @Override
    public String nodeName() {
        return "Prime Type: " + valueString();
    }

    @Override
    public List<Node> childNodes() {
        return null;
    }

    @Override
    public String generate() {
        return switch (variableType) {
            case num, bool -> value.toString();
            case string -> value instanceof String ? value.toString() : ((JsString) value).generate();
            case jsNull -> "null";
            case undefined -> "undefined";
        };
    }
}
