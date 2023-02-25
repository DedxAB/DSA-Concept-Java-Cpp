package arnab.DSA.Recursion;

import java.util.Arrays;

public class MergeSortUsingRecursion {
    public static void main(String[] args) {
        int[] arr = { 8, 5, 3, 9, 4, 6, 1, 7 };
        System.out.println("Before");
        System.out.println(Arrays.toString(arr));
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("After");
        System.out.println(Arrays.toString(arr));
    }

    static void mergeSort(int[] arr, int left, int right) {
        if (left >= right)
            return;
        int mid = left + (right - left) / 2;
        // divide left part
        mergeSort(arr, left, mid);
        // divide right part
        mergeSort(arr, mid + 1, right);
        marge(arr, left, mid, right);
    }

    static void marge(int[] arr, int start, int mid, int end) {
        int[] temp = new int[arr.length];
        int i = start;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= end) {
            if (arr[i] < arr[j])
                temp[k++] = arr[i++];
            else
                temp[k++] = arr[j++];
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= end) {
            temp[k++] = arr[j++];
        }
        for (i = start, k = 0; i <= end; i++, k++) {
            arr[i] = temp[k];
            // or you can write below for that for loop will be for(i = start; i<=end; i++) { arr[i] = temp[i-start]; }
        }
    }
}
