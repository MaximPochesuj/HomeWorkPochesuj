package HomeWork3_To_16_06_2020;

public class InsertionSorting {
    public static void main(String[] args) {
        System.out.println("Исходный массив:");
        // input date
        int [] array = new int[10];
        for (int k = 0; k < array.length; k++) {
            array[k] = (int) Math.round(Math.random()*100);
            System.out.print(array[k] + "  ");
        }

        // algorithm
        int l, tempr;
        for (int k = 0; k < array.length; k++) {
            tempr = array[k];
            for (l = k - 1; l >= 0 && array[l] > tempr; l--){
                array[l+1] = array [l];
            }
            array[l+1] = tempr;
        }

        // output date
        System.out.println();
        System.out.println("Отсортированный массив: ");
        for (int k = 0; k < array.length; k++) System.out.print(array[k] + "  ");

    }
}
