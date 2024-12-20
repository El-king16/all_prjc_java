package collections.Contacts;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContactBook {
    public static void Contact(HashMap<String, String> phone) {

        while (true) {
            Scanner s = new Scanner(System.in);

            System.out.println("Введите номер телефона или list для вывода всех номеров\nили exit для выхода: ");

            String num = s.nextLine();
            if (num.equalsIgnoreCase("exit")) {
                break;
            } else if (num.equalsIgnoreCase("list")) {
                System.out.println(phone);
                continue;
            }
            System.out.println("Введите имя: ");
            String name = s.nextLine();
            if (phone.containsKey(num)) {
                System.out.println("Такое уже есть " + num + " " + phone.get(num));
            } else if (phone.containsValue(name)) {
                for (Map.Entry<String, String> entry : phone.entrySet()) {
                    if (entry.getValue().equals(name)) {
                        System.out.println("Такое уже есть " + entry.getKey() + " " + entry.getValue());
                        break;
                    }
                }
            } else {
                phone.put(num, name);
                System.out.println("добавлено");
            }
        }
    }
}
