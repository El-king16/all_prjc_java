import java.util.HashSet;
import java.util.Iterator;

public class HashS {
    public static void main(String[] args) {
        HashSet<String> h = new HashSet<String>();

        h.add("Russia");
        h.add("USA");
        h.add("UK");
        h.add("France");
        h.add("Belgium");
        h.add("China");

        System.out.println(h);
        System.out.println("List contains India or not:" +
                h.contains("China"));

        h.remove("UK");
        System.out.println("List after removing UK:"+h);

        System.out.println("Iterating over list:");
        Iterator<String> i = h.iterator();
        while (i.hasNext())
            System.out.println(i.next());


    }
}
