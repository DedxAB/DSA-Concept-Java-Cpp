package arnab.DSA;

public class Ded_09_selection_sort {
    static void selectionSort(int[] arr, int size) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    // arr[minIndex] = arr[minIndex] ^ arr[j];
                    // arr[j] = arr[minIndex] ^ arr[j];
                    // arr[minIndex] = arr[minIndex] ^ arr[j];

                    // select the smallest element
                    minIndex = j;
                }
            }
            // arr[i] = arr[i] ^ arr[minIndex];
            // arr[minIndex] = arr[i] ^ arr[minIndex];
            // arr[i] = arr[i] ^ arr[minIndex];

            // after selecting the smallest element, we swap between ith element and the smallest element
            int swap = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = swap;
        }
    }

    static void printArray(int[] arr, int size) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        // Selection sort
        int[] arr = { 5, 6, 3, 2, 4, 7, 9, 15, 10, 1, 13, 14, 8, 12, 11 };
        printArray(arr, arr.length);
        selectionSort(arr, arr.length);
        System.out.println(" ");
        printArray(arr, arr.length);
    }

}
