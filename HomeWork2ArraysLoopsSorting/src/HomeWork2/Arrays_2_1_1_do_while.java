package HomeWork2;

import java.util.Scanner;

public class Arrays_2_1_1_do_while {
    public static void main(String[] args) {
        int i = -1;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите массив:");
        int array = in.nextInt();
        do {i++;
            System.out.println("Элемент массива: " + i);
        }
        while (i < array - 1);
    }
}
