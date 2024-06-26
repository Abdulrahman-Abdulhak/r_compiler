package ast;

import symbolTable.VariableType;

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
}
