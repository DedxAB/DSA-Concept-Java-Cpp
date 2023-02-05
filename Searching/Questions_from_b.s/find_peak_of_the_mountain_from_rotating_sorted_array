package arnab.DSA;

public class Ded_08_find_peak_of_the_mountain {
    static int peakOfMount(int[] arr, int size) {
        int start = 0;
        int end = size - 1;
        int mid = start + (end - start) / 2;
        while (start < end) {
            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
            mid = start + (end - start) / 2;
        }
        return start;
    }

    public static void main(String[] args) {
        // find the peak element of the mountain
        // e.g. [1,2,3,5,3,2]; --> ans === 5
        int[] arr = { 1, 2, 5, 6, 2, 1 };
        int peakElement = peakOfMount(arr, arr.length);
        System.out.println("The peak element of the mountain = " + arr[peakElement]);
    }
}
