package HomeWork3_To_16_06_2020;

import java.util.Arrays;

public class DivisionSorting {
    public static void main(String[] args) {
        System.out.println("Случайный массив:");
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round(Math.random() * 100);
            System.out.print(array[i] + "  ");
        }
        array = sorting(array, 0, array.length - 1);
        System.out.println();
        System.out.println("Отсортированный массив:");
        for (int i = 0; i < array.length; i++) System.out.print(array[i] + "  ");
    }

    public static int[] sorting(int[] arr, int st, int en) {
        if (st >= en) return arr;
        int i = st;
        int j = en;
        int opor = i - (i - j) / 2;
        while (i < j) {
            while ((i < opor) && (arr[i] <= arr[opor])) i++;
            while ((j > opor) && (arr[j] >= arr[opor])) j--;
            if (i < j) {
                int tempr = arr[i];
                arr[i] = arr[j];
                arr[j] = tempr;
                if (i == opor) opor = j;
                else if (j == opor) opor = i;
            }
        }
        sorting(arr, st, opor);
        sorting(arr, opor + 1, en);
        return arr;
    }
}

