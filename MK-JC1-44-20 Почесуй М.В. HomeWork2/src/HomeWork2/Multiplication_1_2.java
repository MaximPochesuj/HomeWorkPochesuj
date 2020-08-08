package HomeWork2;

import java.util.Objects;
import java.util.Scanner;

public class Multiplication_1_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt ();
        if (number > 12) {
            System.out.println("Число не может быть больше 12");
            return;
        }
        if (number == 0){
            System.out.println("Число не может быть равно 0");
            return;
        }
        int result = 1;
        for (int i = 0; i < number; i++) {
            result *= (i + 1);
        }
        System.out.println("Результат выполнения " + result);
    }
}
