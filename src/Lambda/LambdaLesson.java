package Lambda;

public class LambdaLesson {
    public static void main(String[] args) {
        Operation plus = (first, second) -> first + second;
        Operation minus = (first, second) -> first - second;
        Operation mult = (first, second) -> first * second;
        Operation div = (a, b) -> {
            if (b == 0) return 0;
            return a / b;
        } ;
        calc(mult, 2, 5);
        calc(plus, 2, 5);
        calc(minus, 2, 5);
        calc(div, 2, 5);

        fif(12, 8);
    }


    private static void calc(Operation operation, double a, double b){
        System.out.println("Результат: "+ operation.bosinn(a, b));
    }

    private static void fif(double x, double z){
        System.out.println(x+"\n"+z);
    }
}
