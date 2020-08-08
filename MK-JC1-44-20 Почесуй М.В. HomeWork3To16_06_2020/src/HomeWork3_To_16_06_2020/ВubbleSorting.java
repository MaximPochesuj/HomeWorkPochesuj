<<<<<<< HEAD
package HomeWork3_To_16_06_2020;

public class ВubbleSorting {
    public static void bubleSort(int[] arrayVoid){
        for (int i = arrayVoid.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arrayVoid[j] > arrayVoid[j+1]){
                    int tmpr = arrayVoid[j];
                    arrayVoid[j] = arrayVoid[j+1];
                    arrayVoid[j + 1] = tmpr;
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Случайный массив: ");
        int array[] = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + "  ");
        }
        System.out.print("\n");
        bubleSort(array);
        System.out.println("Отсортированный массив: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
    }
}
=======
package HomeWork3_To_16_06_2020;

public class ВubbleSorting {
    public static void bubleSort(int[] arrayVoid){
        for (int i = arrayVoid.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arrayVoid[j] > arrayVoid[j+1]){
                    int tmpr = arrayVoid[j];
                    arrayVoid[j] = arrayVoid[j+1];
                    arrayVoid[j + 1] = tmpr;
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Случайный массив: ");
        int array[] = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + "  ");
        }
        System.out.print("\n");
        bubleSort(array);
        System.out.println("Отсортированный массив: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
    }
}
>>>>>>> abe840cce869bab4642684965272763598f8cc0b
