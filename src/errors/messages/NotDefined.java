package errors.messages;

public class NotDefined extends ErrorMessage {
    public NotDefined(int line) {
        super(line, "NotDefined", "The used name is not defined yet on this line");
    }
}
