package generics;

public class Generics {
    public static void main(String[] args) {

        Integer age = 5;
        System.out.println(age);

        int f = 10;
        Integer fNew = Integer.valueOf(f);
        System.out.println(fNew);

        Character charObject = 'q';
        char charPrimitive = charObject.charValue();

        Integer d1 = 220;
        Integer d2 = 220;

        int d3 = 200;
        int d4 = 200;
        System.out.println(d3 == d4);
        System.out.println(d1.equals(d2));

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        System.out.println(Integer.toBinaryString(8));
    }
}
