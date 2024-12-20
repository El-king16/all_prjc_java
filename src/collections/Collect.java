package collections;

import java.util.Scanner;
import java.util.ArrayList;

public class Collect {
    public static void main(String[] args) {
        // get - возвращение эллемента
        // add(тип), add(int index) - добавление элемента
        // set(int index, значение) - меняет значение
        // remove() - удаляет элемент под номером
        // size() - кол-во элементов списка

        // реализован на основе массива
        // можно хранить null, можно хранить дублирующие элементы
        // порядок хранения элементов соотвествует порядку добавления
        ArrayList<String> password = new ArrayList<>();
        Scanner s = new Scanner(System.in);

        password.add("qwe123");
        password.add("123");
        password.add("qwe");
        password.add("qwerty");
        password.add("12345");
        password.add("qwerty12345");
        password.add("qwe12345");
        password.add("qwerty123");

        String password1 = s.nextLine();

        boolean a = false;

        for (String pass : password) {
            if (password1.equals(pass)) {
                a = true;
                break;
            }
        }

        if (a) {
            System.out.println("Пароль совпал.");
        } else {
            System.out.println("Пароль не найден.");
        }
    }
}
