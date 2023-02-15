package arnab.DSA;

public class BinarySearch {
    static int findNum(int[] arr, int size, int key) {
        int start = 0;
        int end = size - 1;
        int mid = start + (end - start) / 2;
        while (start <= end) {
            if (arr[mid] == key) {
                return mid;
            }
            if (key < arr[mid]) {
                end = mid - 1;
            }
            if (key > arr[mid]) {
                start = mid + 1;
            }
            mid = start + (end - start) / 2;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] even = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int[] odd = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int evenIndex = findNum(even, even.length, 3);
        System.out.println("The number is in " + evenIndex + " position.");
        int oddIndex = findNum(odd, odd.length, 1);
        System.out.println("The number is in " + oddIndex + " position");
    }

}
