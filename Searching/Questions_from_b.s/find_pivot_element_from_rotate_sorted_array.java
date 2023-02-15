package arnab.DSA;

public class Ded_08_find_pivot {
    static int findPivotEle(int[] arr, int size) {
        int start = 0;
        int end = size - 1;
        int mid = start + (end - start) / 2;
        while (start < end) {
            if (arr[mid] >= arr[0]) {
                start = mid + 1;
            } else {
                end = mid;
            }
            mid = start + (end - start) / 2;
        }
        return start;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 7, 10, 18, 19, 2, 3, 4 }; // here we find 2 as a pivot element
        int findPivot = findPivotEle(arr, arr.length);
        System.out.println("The pivot element is " + arr[findPivot]);
    }

}
