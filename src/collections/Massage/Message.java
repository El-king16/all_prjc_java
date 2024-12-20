package collections.Massage;

import java.util.Objects;

public class Message {
    public enum Priority{
        LOW, MEDIUM, HIGH, URGENT
    }

    private int code;
    private String text;
    private Priority priority;

    public Message(int code, String text, Priority priority) {
        this.code = code;
        this.text = text;
        this.priority = priority;
    }

    public int getCode() {
        return code;
    }

    public String getText() {
        return text;
    }

    public Priority getPriority() {
        return priority;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Message message = (Message) o;
        return code == message.code && Objects.equals(text, message.text) && priority == message.priority;
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, text, priority);
    }

    @Override
    public String toString() {
        return "Message{" +
                "code=" + code +
                ", text='" + text + '\'' +
                ", priority=" + priority +
                '}';
    }
}
