package HomeWork3_To_16_06_2020;

public class SelectionSorting {
    public static void main(String[] args) {
        System.out.println("Случайный массив: ");
        int array[] = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
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
        for (int i = 0; i < arrayVoid.length; i++) {
            int minim = arrayVoid[i];
            int minim_i = i;
            for (int j = i + 1; j < arrayVoid.length; j++) {
                if (arrayVoid[j] < minim) {
                    minim = arrayVoid[j];
                    minim_i = j;
                }
            }
            if (i != minim_i) {
                int tmpr = arrayVoid[i];
                arrayVoid[i] = arrayVoid[minim_i];
                arrayVoid[minim_i] = tmpr;
            }
        }
    }
}