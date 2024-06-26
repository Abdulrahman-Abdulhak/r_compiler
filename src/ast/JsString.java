package ast;

import Util.ToString;

public class JsString {
    String value;

    public JsString(String value) { this.value = value; }

    @Override
    public String toString() {
        return value;
    }
}
