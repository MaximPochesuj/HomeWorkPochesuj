package HomeWork3_To_16_06_2020;

import java.util.Arrays;

public class DivisionSorting {
    public static int [] sorting (int [] arr, int st, int en) {
        if (st >= en) return arr;
        int k = st;
        int l = en;

        int opor = k - (k - l)/2;

        while (k < l){
            while ((k < opor) && (arr[k] <= arr[opor])) k++;
            while ((l > opor) && (arr[l] >= arr[opor])) l--;

            if (k < l){
                int tempr = arr[k];
                arr[k] = arr[l];
                arr[l] = tempr;
                if(k == opor) opor = l;
                else if(l == opor) opor = k;
            }

        }

        sorting(arr, st, opor);
        sorting(arr, opor+1, en);

        return arr;
    }
    public static void main(String[] args) {
        System.out.println("Исходный массив: ");
        // input date
        int [] array = new int[10];
        for (int k = 0; k < array.length; k++) {
            array [k] = (int) Math.round(Math.random()*100);
            System.out.print(array [k] + "  ");
        }
        // Algorithm

        array = sorting(array, 0, array.length-1);

        // output date
        System.out.println();
        System.out.println("Отсортированный массив:");
        for (int k = 0; k < array.length; k++) System.out.print(array[k] + "  ");
            
        }
}

