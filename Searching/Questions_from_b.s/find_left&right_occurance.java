package arnab.DSA;

public class Ded_08_find_first_last_position {
    static int findLeftOccurance(int[] arr, int size, int key) {
        int ans = -1;
        int start = 0;
        int end = size - 1;
        int mid = start + (end - start) / 2;
        while (start <= end) {
            if (key == arr[mid]) {
                ans = mid;
                end = mid - 1;
            }
            if (key < arr[mid]) {
                end = mid - 1;
            }
            if (key > arr[mid]) {
                start = mid + 1;
            }
            mid = start + (end - start) / 2;
        }
        return ans;
    }

    static int findRightOccurance(int[] arr, int size, int key) {
        int ans = -1;
        int start = 0;
        int end = size - 1;
        int mid = start + (end - start) / 2;
        while (start <= end) {
            if (key == arr[mid]) {
                ans = mid;
                start = mid + 1;
            }
            if (key < arr[mid]) {
                end = mid - 1;
            }
            if (key > arr[mid]) {
                start = mid + 1;
            }
            mid = start + (end - start) / 2;
        }
        return ans;
    }

    public static void main(String[] args) {
        // find the fisrt and last position of an element from an array
        int[] even = { 1, 2, 3, 3, 3, 3, 3, 3, 3, 3, 5 };
        // int[] odd = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int evenLeftIndex = findLeftOccurance(even, even.length, 3);
        int evenRightIndex = findRightOccurance(even, even.length, 3);
        System.out.println("The left occurance of the number is in " + evenLeftIndex + "th index");
        System.out.println("The Right occurance of the number is in " + evenRightIndex + "th index");
        System.out.println("Total no of occurance = " + ((evenRightIndex-evenLeftIndex)+1));
    }

}
