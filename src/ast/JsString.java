package ast;

public class JsString {
    String value;

    public JsString(String value) { this.value = value; }

    @Override
    public String toString() {
        return ToString.self(
                "String",
                ToString.var("value", value)
        );
    }
}
