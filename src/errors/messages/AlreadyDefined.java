package errors.messages;

public class AlreadyDefined extends ErrorMessage {
    public AlreadyDefined(int line) {
        super(line, "AlreadyDefined", "The variable can't be defined again.");
    }
}
