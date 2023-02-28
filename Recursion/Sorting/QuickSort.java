package arnab.DSA.Recursion;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = { 80, 30, 50, 70, 60, 40, -4, 74, 35, 12, -10, 99, 5 };
        applyQuickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void applyQuickSort(int[] arr, int start, int end) {
        if (start >= end)
            return;
        int partIdx = partition(arr, start, end);
        applyQuickSort(arr, start, partIdx - 1);
        applyQuickSort(arr, partIdx + 1, end);
    }

    static int partition(int[] arr, int start, int end) {
        int pivot = arr[start];
        int count = 0;
        for (int i = start + 1; i <= end; i++) {
            if (arr[i] <= pivot) {
                count++;
            }
        }
        int pivotIdx = start + count;
        int swap = pivot;
        arr[start] = arr[pivotIdx];
        // pivot = arr[pivotIdx];
        arr[pivotIdx] = swap;
        int i = start;
        int j = end;
        while (i <= pivotIdx && pivotIdx < j) {
            while (arr[i] <= arr[pivotIdx])
                i++;
            while (arr[j] > arr[pivotIdx])
                j--;
            if (i <= pivotIdx && pivotIdx < j) {
                int swapp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapp;
            }
        }
        return pivotIdx;
    }
}
