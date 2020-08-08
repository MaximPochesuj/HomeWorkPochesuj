<<<<<<< HEAD
package HomeWork3_To_16_06_2020;

import java.util.Random;

public class ShakerSorting {
    public static void main(String[] args) {
        System.out.println("Исходный массив:");
        int [] array = new int [10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round(Math.random()*100);
            System.out.print(array[i] + "  ");
        }
        int left = 1, right = array.length-1;
            do {
                for (int i = right; i >= left; i--){
                    if(array[i-1] > array[i]) {
                        int tempr = array[i];
                        array[i] = array[i - 1];
                        array[i - 1] = tempr;
                    }
                }
                left++;
                for (int i = left; i <= right; i++) {
                    if(array[i-1] > array[i]) {
                        int temp = array[i];
                        array[i] = array[i - 1];
                        array[i - 1] = temp;
                    }
                }
                right--;
            } while (left <= right);
        System.out.println();
        System.out.println("Отсортированный массив: ");
        for (int i = 0; i < array.length; i++) System.out.print(array[i] + "  ");
    }
}
=======
package HomeWork3_To_16_06_2020;

import java.util.Random;

public class ShakerSorting {
    public static void main(String[] args) {
        System.out.println("Исходный массив:");
        int [] array = new int [10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round(Math.random()*100);
            System.out.print(array[i] + "  ");
        }
        int left = 1, right = array.length-1;
            do {
                for (int i = right; i >= left; i--){
                    if(array[i-1] > array[i]) {
                        int tempr = array[i];
                        array[i] = array[i - 1];
                        array[i - 1] = tempr;
                    }
                }
                left++;
                for (int i = left; i <= right; i++) {
                    if(array[i-1] > array[i]) {
                        int temp = array[i];
                        array[i] = array[i - 1];
                        array[i - 1] = temp;
                    }
                }
                right--;
            } while (left <= right);
        System.out.println();
        System.out.println("Отсортированный массив: ");
        for (int i = 0; i < array.length; i++) System.out.print(array[i] + "  ");
    }
}
>>>>>>> abe840cce869bab4642684965272763598f8cc0b
