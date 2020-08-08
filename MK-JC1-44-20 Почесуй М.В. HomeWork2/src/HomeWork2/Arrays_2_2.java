package HomeWork2;

import java.util.Scanner;

public class Arrays_2_2 {
    public static void main(String[] args) {
        int [] array = new int[15];
        for (int i = 0; i < array.length; i++) {
            i++;
            System.out.println("Каждый второй элемент массива: " + i);
        }
    }
}
