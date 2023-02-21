package arnab.DSA.Recursion;

import java.util.Arrays;

public class LinearSearchUsingRecursion {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        boolean ans = findElement(arr, 1, arr.length, 3);
        if (ans)
            System.out.println("Found");
        else
            System.out.println("Not found");
    }

    static boolean findElement(int[] arr, int indx, int size, int key) {
        // printing array elements
        System.out.println(Arrays.toString(arr));
        // base case
        if (size == 0)
            return false;
        if (arr[indx - 1] == key)
            return true;
        else {
            boolean lastPart = findElement(arr, indx + 1, size - 1, key);
            return lastPart;
        }
    }
}
