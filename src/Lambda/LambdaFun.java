package Lambda;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaFun {
    public static void main(String[] args) {
        //Предикат используется для проверки на соотеветствие условия
        //абстрактный метод boolean test(T t);
        Predicate<Integer> isPos = x -> x > 0;
        Predicate<Integer> isNeg = x -> x < 0;
        Predicate<Integer> isEven = x -> x % 2 == 0;

        System.out.println(isPos.test(5));
        System.out.println(isPos.and(isEven).test(98));

        //Function предоставляет переход от одного объекта к другому
        //R apply(T t)
        Function<Integer, Double> minus20 = x -> x * 0.8;
        Function<Integer, String> str = x -> {
            if (x <= 0 ) throw new IllegalArgumentException("Число должно быть положительным");
            return x + " руб";
        };

        System.out.println(minus20.apply(100));
        System.out.println(str.apply(1000));

        // Consumer  - используется для выполнения некоторго действия надо оьъектом типа Т
        // void accept(T t);

        // Supplier - используется для создания объектов
        //абстрактный метод T get();

        //BinaryOperator<T> используется для выполнения над двумя объектами
        // абст метод T apply(T t1, T t2);

        //Comparator - функц. истефейс
    }
}
