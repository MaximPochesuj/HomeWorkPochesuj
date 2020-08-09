package HomeWork2.Loops;

import java.util.Objects;
import java.util.Scanner;

public class Multiplication_1_2 {
    public static void main(String[] args) {

        if (args.length == 1) {
            String arg = args[0];
            int n = Integer.parseInt(arg);
            System.out.println("Число в командной строке: " + n);

            int result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            System.out.println("Результат выполнения " + result);
        } else if (args.length == 0) {
            System.out.println("В параметрах командной строки нет элементов");
        } else System.out.println("В параметрах командной строки больше 1 элемента");
    }
}
