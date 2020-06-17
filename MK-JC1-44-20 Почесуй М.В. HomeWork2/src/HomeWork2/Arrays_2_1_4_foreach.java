package HomeWork2;

import java.util.Scanner;

public class Arrays_2_1_4_foreach {
    public static void main(String[] args) {
        int i = -1;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите массив:");
        int array = in.nextInt();
        int [] elements = new int[array];
        for (int m: elements) {
            i++;
            System.out.println("Элемент массива: " + i);
        }
    }
}
