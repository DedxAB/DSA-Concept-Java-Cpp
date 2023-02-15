package arnab.DSA;

public class LinearSearch {
    static int findNum(int[] arr, int size, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i]) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] even = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int[] odd = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int evenIndex = findNum(even, even.length, 7);
        System.out.println("The number is in " + evenIndex + " position.");
        int oddIndex = findNum(odd, odd.length, 1);
        System.out.println("The number is in " + oddIndex + " position");
    }
    
}
