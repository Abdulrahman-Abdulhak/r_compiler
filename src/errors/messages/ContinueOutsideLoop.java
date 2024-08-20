package errors.messages;

public class ContinueOutsideLoop extends ErrorMessage {

    public ContinueOutsideLoop(int line) {
        super(line, "ContinueOutsideLoop", "Illegal use of the keyword \"continue\".");
    }
}
