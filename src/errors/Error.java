package errors;

import errors.messages.ErrorMessage;

import java.util.ArrayList;
import java.util.List;

public class Error {
    List<ErrorMessage> messages;

    public Error() {
        this(new ArrayList<>());
    }
    public Error(List<ErrorMessage> messages) {
        this.messages = messages;
    }

    public List<ErrorMessage> getMessages() {
        return messages;
    }
    public void setMessages(List<ErrorMessage> messages) {
        this.messages = messages;
    }

    public void addError(ErrorMessage message) {
        messages.add(message);
    }
    public void addError(int line, String message) {
        addError(new ErrorMessage(line, message));
    }

    public void sort() {

    }

    public void showErrors() {
        if(messages.isEmpty()) return;

        System.out.println("You Have " + messages.size() + " errors");
        System.out.println();
        for (var message : messages) {
            System.err.println(message);
            System.out.println();
        }
    }
}
