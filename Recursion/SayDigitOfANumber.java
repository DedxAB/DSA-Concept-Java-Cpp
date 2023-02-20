package arnab.DSA.Recursion;

import java.util.Scanner;

public class SayDigitOfANumber {
    public static void main(String[] args) {
        System.out.println("Enter a number ");
        try (Scanner sc = new Scanner(System.in)) {
            int digit = sc.nextInt();
            String[] arr = { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine" };
            SayDigit(digit, arr);
        }
    }

    static void SayDigit(int digit, String[] arr) {
        // base case
        if (digit == 0)
            return;
        int r = digit % 10;
        int newDigit = digit / 10;
        SayDigit(newDigit, arr);
        System.out.print(arr[r] + " ");
    }
}
