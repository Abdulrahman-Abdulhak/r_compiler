package errors.messages;

public class IllegalBreak extends ErrorMessage {

    public IllegalBreak(int line) {
        super(line, "IllegalBreak", "Illegal use of the keyword \"break\".");
    }
}
