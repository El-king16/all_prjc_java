package lpp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


//class LoginException extends Exception {
//    public LoginException(String message) {
//        super(message);
//    }
//}

//class PasswordException extends Exception {
//    public PasswordException(String message) {
//        super(message);
//    }
//}

public class UserRegistration {
    private static final List<User> users = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введте логин: ");
            String login = scanner.nextLine();

            System.out.print("Введите пароль: ");
            String password = scanner.nextLine();

            System.out.print("Повторите пароль: ");
            String repeatPassword = scanner.nextLine();

            try {
                registerUser(login, password, repeatPassword);
                System.out.println("Успешная регистрация!");
            } catch (LoginException | PasswordException e) {
                System.out.println(e.getMessage());
            }

            System.out.print("Хотите добавить нового пользователя? (y/n): ");
            String continueRegistration = scanner.nextLine();
            if (!continueRegistration.equalsIgnoreCase("y")) {
                break;
            }
        }

        printAllUsers();
    }

    public static void registerUser(String login, String password, String repeatPassword) throws LoginException, PasswordException {
        if (!isValidLogin(login)) {
            throw new LoginException("Неверный логин. Логин должен быть длиной менее 15 символов и содержать только латинские буквы, цифры и подчеркивания.");
        }

        if (!isValidPassword(password)) {
            throw new PasswordException("Неверный пароль. Пароль должен содержать от 7 до 20 символов и содержать только латинские буквы, цифры и символы подчеркивания.");
        }

        if (!password.equals(repeatPassword)) {
            throw new PasswordException("Пароли не совпадают.");
        }

        users.add(new User(login, password));
    }

    private static boolean isValidLogin(String login) {
        return login.matches("^[a-zA-Z0-9_]{1,14}$");
    }

    private static boolean isValidPassword(String password) {
        return password.matches("^[a-zA-Z0-9_]{7,20}$");
    }

    public static void printAllUsers() {
        for (User user : users) {
            System.out.println("Логин: " + user.getLogin() + ", Пароль: " + user.getPassword());
        }
    }


}

