package arnab.DSA.Recursion;

// import java.util.Arrays;

public class BinarySearchUsingRecursion {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 9 };
        boolean ans = findNum(arr, 0, arr.length - 1, arr.length, 6);
        if (ans)
            System.out.println("Found");
        else
            System.out.println("Not found");
    }

    static boolean findNum(int[] arr, int start, int end, int size, int key) {
        // System.out.println(Arrays.toString(arr));
        // base case
        if (start > end)
            return false;
        int mid = start + (end - start) / 2;
        // System.out.println("\nmid is " + mid + " and key is " + key +"\n");
        // case if key found
        if (arr[mid] == key)
            return true;
        if (arr[mid] < key)
            return findNum(arr, mid + 1, end, size, key);
        else
            return findNum(arr, start, mid - 1, size, key);
    }
}
