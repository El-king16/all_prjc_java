package collections.Mail;

import java.util.HashSet;
import java.util.Scanner;

public class AddEmail {
    public static void Adds(HashSet<String> email, Scanner s){


        boolean exit = false;
        System.out.println("Введите 'add' чтобы добавить эл. почту");
        System.out.println("Введите 'list' чтобы вывести список эл. почт");
        System.out.println("Введите 'exit' чтобы выйти");
        System.out.println("Введите ваш выбор: ");
        String choice = s.nextLine();

        switch (choice) {

            case "add":
                System.out.println("Введите вашу эл. почту: ");
                String typeMail = s.nextLine();
                if (typeMail.contains("@") && typeMail.contains(".")) {
                    email.add(typeMail);
                    System.out.println("Электронная почта добавлена.");
                } else {
                    System.out.println("Неправильно введённая эл. почта");
                }
                break;

            case "list":
                System.out.println(email);
                break;

            case "exit":
                exit = true;
                System.out.println("Выход из программы...");
                break;

            default:
                System.out.println("Некорректный ввод. Попробуйте снова.");
                break;
        }
    }
}
