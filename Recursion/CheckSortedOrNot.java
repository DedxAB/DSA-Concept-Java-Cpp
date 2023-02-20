package arnab.DSA.Recursion;

public class CheckSortedOrNot {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 8, 7 };
        // int size = 5;
        boolean ans = isSortedArray(arr, 1, arr.length);
        if (ans) {
            System.out.println("Sorted");
        } else {
            System.out.println("Not sorted");
        }
    }

    static boolean isSortedArray(int[] arr, int indx, int size) {
        // base condition
        if (size <= 1) {
            return true;
        }
        if (arr[indx - 1] > arr[indx]) {
            return false;
        } else {
            Boolean ans = isSortedArray(arr, indx + 1, size - 1);
            return ans;
        }
    }
}
