package arnab.DSA;

public class Ded_10_Bubble_sort {
    static void bubbleSort(int[] arr, int size) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    arr[j] = arr[j] ^ arr[j + 1];
                    arr[j + 1] = arr[j] ^ arr[j + 1];
                    arr[j] = arr[j] ^ arr[j + 1];
                }
            }
        }
    }

    static void printArray(int[] arr, int size) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        // Bubble sort
        int[] arr = { 5, 6, 3, 2, 4, 7, 9, 15, 10, 1, 13, 14, 8, 12, 11 };
        printArray(arr, arr.length);
        bubbleSort(arr, arr.length);
        System.out.println(" ");
        printArray(arr, arr.length);

    }

}
