package HomeWork3_To_16_06_2020;

import java.util.Arrays;

public class MergeSorting {

    public static void main(String[] parametrs) {
        int[] arr = new int[]{64, 42, 73, 41, 32, 53, 16, 24, 57, 42, 74, 55, 36};
        System.out.println(arrayToString(arr));
        arr = mergeSorting(arr);
    }

    public static int[] mergeSorting(int[] arr) {
        int[] temp;
        int[] currentMean = arr;
        int[] currentAim = new int[arr.length];

        int size = 1;
        while (size < arr.length) {
            for (int i = 0; i < arr.length; i += 2 * size) {
                merging(currentMean, i, currentMean, i + size, currentAim, i, size);
            }

            temp = currentMean;
            currentMean = currentAim;
            currentAim = temp;

            size = size * 2;
            System.out.println(arrayToString(currentMean));
        }
        return currentMean;
    }

    private static void merging(int[] mean1, int mean1Beg, int[] mean2, int src2Start, int[] dest,
                              int destStart, int size) {
        int index1 = mean1Beg;
        int index2 = src2Start;

        int src1End = Math.min(mean1Beg + size, mean1.length);
        int src2End = Math.min(src2Start + size, mean1.length);

        int iterationCount = src1End - mean1Beg + src2End - src2Start;

        for (int i = destStart; i < destStart + iterationCount; i++) {
            if (index1 < src1End && (index2 >= src2End || mean1[index1] < mean2[index2])) {
                dest[i] = mean1[index1];
                index1++;
            } else {
                dest[i] = mean2[index2];
                index2++;
            }
        }
    }

    private static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                sb.append(", ");
            }
                sb.append(array[i]);
            }
            sb.append("]");
            return sb.toString();
    }
}