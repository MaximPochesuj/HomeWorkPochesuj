package HomeWork2;

import java.util.Scanner;

public class Arrays_2_1_3_for {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите массив:");
        int array = in.nextInt();
        for (int i = 0; i < array; i++) {
            System.out.println("Элемент массива: " + i);
        }
    }
}
