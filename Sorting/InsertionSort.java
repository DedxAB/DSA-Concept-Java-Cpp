package arnab.DSA;

public class Ded_09_Insertion_sort {
    static void applyInsertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (arr[j] > temp) {
                    arr[j + 1] = arr[j];
                } else {
                    break;
                }
            }
            arr[j + 1] = temp;
        }
    }

    static void printElement(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 5, 6, 3, 2, 4, 7, 9, 15, 10, 1, 13, 14, 8, 12, 11 };
        printElement(arr);
        applyInsertionSort(arr);
        System.out.println(" ");
        printElement(arr);
    }

}
