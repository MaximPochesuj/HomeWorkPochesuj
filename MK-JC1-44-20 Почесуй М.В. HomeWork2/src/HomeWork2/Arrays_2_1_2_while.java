package HomeWork2;

import java.util.Scanner;

public class Arrays_2_1_2_while {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите массив:");
        int array = in.nextInt();
        int i = -1;
        while (i < array - 1) {
            i++;
            System.out.println("Элемент массива: " + i);
        }
    }
}
