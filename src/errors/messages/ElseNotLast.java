package errors.messages;

public class ElseNotLast extends ErrorMessage {
    public ElseNotLast(int line) {
        super(line, "ElseNotLast", "Else line should be chained at the very last.");
    }
}
