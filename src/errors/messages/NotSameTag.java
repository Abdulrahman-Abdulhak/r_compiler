package errors.messages;

public class NotSameTag extends ErrorMessage {

    public NotSameTag(int line) {
        super(line, "NotSameTag", "Closing tag of jsx not the same as the opening tag.");
    }
}
