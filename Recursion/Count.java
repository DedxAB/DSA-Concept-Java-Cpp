package arnab.DSA.Recursion;

import java.util.Scanner;

public class Count {
    static void printDecendingCount(int n) {
        // tale resursion
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printDecendingCount(n - 1);
    }

    static void printAcendingCount(int n) {
        // head recursion
        if (n == 0) {
            return;
        }
        printAcendingCount(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        // print counting like 5 4 3 2 1
        try (
                Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            printDecendingCount(n);
            System.out.println("\n");
            printAcendingCount(n);
        }
    }

}
