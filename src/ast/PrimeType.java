package ast;

public class PrimeType extends Returnable {
    String type;
    Object value;

    public PrimeType(int value) {
        this.value = value;
        type = "num";
    }
    public PrimeType(float value) {
        this.value = value;
        type = "num";
    }
    public PrimeType(double value) {
        this.value = value;
        type = "num";
    }
    public PrimeType(JsString str) {
        value = str;
        type = "string";
    }
    public PrimeType(String str) {
        value = str;
        type = "string";
    }
    public PrimeType(boolean bool) {
        value = bool;
        type = "bool";
    }
    public PrimeType(JsNull nullVal) {
        value = nullVal;
        type = "null";
    }
    public PrimeType() {
        value = null;
        type = "undefined";
    }

    @Override
    String type() { return "PrimeType"; }

    @Override
    Object[] members() {
        return new Object[]{"type", type, "value", value};
    }
}
