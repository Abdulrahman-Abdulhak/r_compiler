package errors.messages;

public class UndeclaredVariable extends ErrorMessage {
    public UndeclaredVariable(int line) {
        super(line, "UndeclaredVariable", "Use of undeclared variable.");
    }
    public UndeclaredVariable(int line, String variable) {
        super(line, "UndeclaredVariable", "Use of undeclared variable {" + variable + "}.");
    }
}
