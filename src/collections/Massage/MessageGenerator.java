package collections.Massage;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MessageGenerator {
    private Random random;
    private List<String> sampleTexts;

    public MessageGenerator() {
        random = new Random();
        sampleTexts = List.of("Ошибка в системе", "Задача выполнена", "Проблемы с подключением", "Вход пользователя", "Бэкап создан");
    }

    public List<Message> generateMessages(int count) {
        List<Message> messages = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            int code = random.nextInt(100);
            String text = sampleTexts.get(random.nextInt(sampleTexts.size()));
            Message.Priority priority = Message.Priority.values()[random.nextInt(Message.Priority.values().length)];
            messages.add(new Message(code, text, priority));
        }
        return messages;
    }
}


