package collections;
import java.util.*;


public class LinkList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = 5;
        int Y = 6;
        int[][] matrix = new int[X][Y];
        System.out.println("Введите 12 чисел:\n");

        for (int i = 0; i < X; i++) {
            for (int j = 0; j < Y; j++) {
                int a = sc.nextInt();
                matrix[i][j] = a;
            }
        }

        for (int i = 0; i < X; i++) {
            for (int j = 0; j < Y; j++) {
                System.out.println(matrix[i][j]);
                if (j != Y - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println(" ");
        }





    }
}
