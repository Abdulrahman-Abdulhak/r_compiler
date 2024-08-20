package errors.messages;

public class ErrorMessage {
    int line;
    String name, message;

    public ErrorMessage(int line, String message) {
        this(line, "", message);
    }
    public ErrorMessage(int line, String name, String message) {
        this.line = line;
        this.name = name;
        this.message = message;
    }

    public int getLine() {
        return line;
    }
    public void setLine(int line) {
        this.line = line;
    }

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Error " + name + " At Line " + line + " : " + message;
    }
}
