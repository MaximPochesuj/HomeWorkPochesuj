package HomeWork2;

public class SelectionSorting_3_2 {

    public static void selectionSort(int[] arrayVoid){
        for (int i = 0; i < arrayVoid.length; i++) {
            int min = arrayVoid[i];
            int min_i = i;
            for (int j = i+1; j < arrayVoid.length; j++) {
                if (arrayVoid[j] < min) {
                    min = arrayVoid[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                int tmp = arrayVoid[i];
                arrayVoid[i] = arrayVoid[min_i];
                arrayVoid[min_i] = tmp;
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
        selectionSort(array);
        System.out.println("Отсортированный массив: ");
        for(int i = 0; i <  array.length; i++) {
            System.out.print(array[i] + "  ");
        }
    }
}