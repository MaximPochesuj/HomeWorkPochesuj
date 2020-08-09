package HomeWork3_To_16_06_2020;

public class InsertionSorting {
    public static void main(String[] args) {
        System.out.println("Случайный массив:");
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round(Math.random() * 100);
            System.out.print(array[i] + "  ");
        }
        System.out.println();
        insertionSort(array);
        System.out.println("Отсортированный массив: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
    }

    public static void insertionSort(int[] arrayVoid) {
        int j, tempr;
        for (int i = 0; i < arrayVoid.length; i++) {
            tempr = arrayVoid[i];
            for (j = i - 1; j >= 0 && arrayVoid[j] > tempr; j--) {
                arrayVoid[j + 1] = arrayVoid[j];
            }
            arrayVoid[j + 1] = tempr;
        }
    }
}


