package errors.messages;

public class MultipleElseUse extends ErrorMessage {
    public MultipleElseUse(int line) {
        super(line, "MultipleElseUse", "Can't use more than one else in one file");
    }
}
