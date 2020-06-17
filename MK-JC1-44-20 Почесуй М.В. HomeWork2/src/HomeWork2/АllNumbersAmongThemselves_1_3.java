package HomeWork2;

import java.util.Scanner;

public class АllNumbersAmongThemselves_1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int num = scanner.nextInt();
        int ymn = 1;
        while (num != 0) {
            ymn *= num % 10;
            num /= 10;
        }
        System.out.println("Общий числитель чисел: " + ymn);
    }
}