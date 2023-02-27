package arnab.DSA.Recursion;

import java.util.Arrays;

public class QuickSortUsingRecursion {
    public static void main(String[] args) {
        int[] arr = { 5, 3, 1, 6, 2 };
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void quickSort(int[] arr, int left, int end) {
        if (left >= end)
            return;
        int pIndex = partition(arr, left, end);
        quickSort(arr, left, pIndex - 1);
        quickSort(arr, pIndex + 1, end);
    }

    static int partition(int[] arr, int left, int end) {
        int pivot = arr[left];
        int i = left + 1;
        int j = end;
        do {
            while (arr[i] <= pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i < j) {
                int swap = arr[i];
                arr[i] = arr[j];
                arr[j] = swap;
            }
        } while (i < j);
        int swap = arr[left];
        arr[left] = arr[j];
        arr[j] = swap;
        return j;
    }

}
