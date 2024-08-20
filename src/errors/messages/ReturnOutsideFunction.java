package errors.messages;

public class ReturnOutsideFunction extends ErrorMessage {

    public ReturnOutsideFunction(int line) {
        super(line, "ReturnOutsideFunction", "Illegal use of the keyword \"return\".");
    }
}
