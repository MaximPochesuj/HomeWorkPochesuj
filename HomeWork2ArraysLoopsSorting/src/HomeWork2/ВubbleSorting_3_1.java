package HomeWork2;

public class ВubbleSorting_3_1 {

    public static void bubbleSort(int[] arrayVoid) {
        for (int i = arrayVoid.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arrayVoid[j] > arrayVoid[j + 1]) {
                    int tmp = arrayVoid[j];
                    arrayVoid[j] = arrayVoid[j + 1];
                    arrayVoid[j + 1] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Случайный массив: ");
        int array[] = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()*100);
            System.out.print(array[i] + "  ");
        }
        System.out.print("\n");
        bubbleSort(array);
        System.out.println("Отсортированный массив: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
    }
}