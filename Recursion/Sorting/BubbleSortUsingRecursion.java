package arnab.DSA.Recursion;

import java.util.Arrays;

public class BubbleSortUsingRecursion {
    public static void main(String[] args) {
        int[] arr = { 8, 1, 2, 4, 5, 3, 9, 7, 6, 0 };
        sortArr(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static void sortArr(int[] arr, int size) {
        // base case
        if (size <= 1)
            return;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int swap = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = swap;
            }
        }
        sortArr(arr, size - 1);
    }
}
