package collections.Massage;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Создание генератора сообщений
        MessageGenerator generator = new MessageGenerator();

        // Генерация 20 сообщений
        List<Message> generatedMessages = generator.generateMessages(20);
        System.out.println("Generated messages: " + generatedMessages);

        // Создание процессора сообщений
        MessageProcessor processor = new MessageProcessor(generatedMessages);

        // Уникальные сообщения в порядке добавления
        List<Message> uniqueMessages = processor.getUniqueMessagesInOrder();
        System.out.println("Unique messages in order: " + uniqueMessages);

        // Удаление сообщений с заданным приоритетом
        processor.removeMessagesByPriority(Message.Priority.HIGH);

        // Оставить только сообщения с заданным приоритетом
        processor = new MessageProcessor(generator.generateMessages(20)); // Повторное создание для демонстрации
        processor.retainMessagesByPriority(Message.Priority.LOW);

        // Подсчёт сообщений по приоритетам
        Map<Message.Priority, Long> priorityCount = processor.countMessagesByPriority();
        System.out.println("Messages by priority: " + priorityCount);

        // Подсчёт сообщений по кодам
        Map<Integer, Long> codeCount = processor.countMessagesByCode();
        System.out.println("Messages by code: " + codeCount);

        // Подсчёт уникальных сообщений
        long uniqueCount = processor.countUniqueMessages();
        System.out.println("Number of unique messages: " + uniqueCount);
    }
}

