package collections.Mail;

import java.util.HashSet;
import java.util.Scanner;

public class Email {

    public static void main(String[] args) {
        HashSet<String> email = new HashSet<>();
        Scanner s = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            AddEmail.Adds(email, s);

        }

    }


}

