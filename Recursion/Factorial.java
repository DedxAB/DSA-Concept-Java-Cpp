package arnab.DSA.Recursion;

import java.util.Scanner;

public class Factorial {
    static int factorial(int num) {
        // base condition
        if (num == 0) {
            return 1;
        }
        return num * factorial(num - 1); // resursive relation
    }

    public static void main(String[] args) {
        System.out.println("Enter a number");
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
            int fact = factorial(num);
            System.out.println(fact);
        }

    }

}
