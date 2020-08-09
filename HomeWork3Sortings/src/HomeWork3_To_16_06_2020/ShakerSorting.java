package HomeWork3_To_16_06_2020;

import java.util.Random;

public class ShakerSorting {
    public static void main(String[] args) {
        System.out.println("Cлучайный массив:");
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round(Math.random() * 100);
            System.out.print(array[i] + "  ");
        }
        System.out.println();
        selectionSort(array);
        System.out.println("Отсортированный массив: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
    }

    public static void selectionSort(int[] arrayVoid) {
        int left = 1, right = arrayVoid.length - 1;
        do {
            for (int i = right; i >= left; i--) {
                if (arrayVoid[i - 1] > arrayVoid[i]) {
                    int tempr = arrayVoid[i];
                    arrayVoid[i] = arrayVoid[i - 1];
                    arrayVoid[i - 1] = tempr;
                }
            }
            left++;
            for (int i = left; i <= right; i++) {
                if (arrayVoid[i - 1] > arrayVoid[i]) {
                    int temp = arrayVoid[i];
                    arrayVoid[i] = arrayVoid[i - 1];
                    arrayVoid[i - 1] = temp;
                }
            }
            right--;
        } while (left <= right);
    }
}
