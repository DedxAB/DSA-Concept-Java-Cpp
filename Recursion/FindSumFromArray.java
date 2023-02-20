package arnab.DSA.Recursion;

public class FindSumFromArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int sum = findSum(arr, 1, arr.length);
        System.out.println(sum);
    }

    static int findSum(int[] arr, int indx, int size) {
        // base case
        if (size <= 1)
            return arr[indx - 1];
        int remaining = findSum(arr, indx + 1, size - 1);
        int sum = arr[indx - 1] + remaining;
        return sum;
    }
}
