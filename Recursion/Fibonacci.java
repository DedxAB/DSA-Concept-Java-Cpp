package arnab.DSA.Recursion;

import java.util.Scanner;

public class Fibonacci {
    static int findFibonacci(int n) {
        // base case
        // if (n == 0)
        //     return 0;
        // if (n == 1)
        //     return 1;
        if (n <= 1) {
            return n;
        }
        return findFibonacci(n - 1) + findFibonacci(n - 2);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int ans = findFibonacci(n);
            System.out.println(n + "th element of the fibonacci series is " + ans);
        }
    }

}
