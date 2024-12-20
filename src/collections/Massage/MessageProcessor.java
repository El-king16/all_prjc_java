package collections.Massage;

import java.util.*;
import java.util.stream.Collectors;

public class MessageProcessor {
    private List<Message> messages;

    public MessageProcessor(List<Message> messages) {
        this.messages = new ArrayList<>(messages);
    }

    public List<Message> getMessages() {
        return messages;
    }

    public List<Message> getUniqueMessagesInOrder() {
        Set<Message> uniqueSet = new LinkedHashSet<>(messages);
        return new ArrayList<>(uniqueSet);
    }

    public void removeMessagesByPriority(Message.Priority priority) {
        System.out.println("Before removal: " + messages);
        messages.removeIf(message -> message.getPriority() == priority);
        System.out.println("After removal: " + messages);
    }

    public void retainMessagesByPriority(Message.Priority priority) {
        System.out.println("Before retention: " + messages);
        messages.removeIf(message -> message.getPriority() != priority);
        System.out.println("After retention: " + messages);
    }

    public Map<Message.Priority, Long> countMessagesByPriority() {
        return messages.stream()
                .collect(Collectors.groupingBy(Message::getPriority, Collectors.counting()));
    }

    public Map<Integer, Long> countMessagesByCode() {
        return messages.stream()
                .collect(Collectors.groupingBy(Message::getCode, Collectors.counting()));
    }

    public long countUniqueMessages() {
        return new HashSet<>(messages).size();
    }
}

