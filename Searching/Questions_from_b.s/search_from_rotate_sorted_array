package arnab.DSA;

public class Ded_08_search_in_rotate_sorted_array {
    static int findPivotEle(int[] arr, int size) {
        int start = 0;
        int end = size - 1;
        int mid = start + (end - start) / 2;
        while (start < end) {
            // find the pivot element
            if (arr[mid] >= arr[0]) {
                start = mid + 1;
            } else {
                end = mid;
            }
            mid = start + (end - start) / 2;
        }
        return start;
    }

    static int binarySearch(int[] arr, int start, int end, int key) {
        int s = start;
        int e = end;
        int mid = start + (end - start) / 2;
        while (s <= e) {
            if (key == arr[mid]) {
                return mid;
            }
            if (key < arr[mid]) {
                e = mid - 1;
            }
            if (key > arr[mid]) {
                s = mid + 1;
            }
            mid = s + (e - s) / 2;
        }
        return -1;
    }

    static int findKey(int[] arr, int size, int key) {
        int pivotEl = findPivotEle(arr, key);
        if (arr[pivotEl] <= key && key <= arr[size - 1]) {
            return binarySearch(arr, pivotEl, size - 1, key);
        } else {
            return binarySearch(arr, 0, pivotEl - 1, key);
        }
    }

    public static void main(String[] args) {
        // Search in a rotate sorted array
        // e.g. [7,8,1,3,5]-->and key element is 3-->now find 3 in this array
        int[] arr = { 7, 8, 9, 1, 3, 5 };
        int keyFind = findKey(arr, arr.length, 3);
        System.out.println("Key found at index " + keyFind + " position");
    }

}
