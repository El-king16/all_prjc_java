package collections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

public class CharLinkedList {
    public static void main(String[] args) {
        Random r = new Random();
        LinkedList<Double> list = new LinkedList<>();

        for (int i = 0; i<10;i++) {
            double w = Math.round((r.nextDouble(100) + 1) * 100.0) / 100.0;
            list.add(w);

        }

        System.out.println(list);

        Collections.sort(list);

        System.out.println(list);

    }
}
