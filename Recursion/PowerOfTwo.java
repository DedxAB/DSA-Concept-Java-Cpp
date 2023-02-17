package arnab.DSA.Recursion;

import java.util.Scanner;

public class PowerOfTwo {
    static int power(int n) {
        if (n == 0) {
            return 1;
        }
        return 2 * power(n-1);
    }
    public static void main(String[] args) {
        System.out.println("Enter the power element: ");
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
            int ans = power(num);
            System.out.println("2 to the power " + num + " = " + ans);
        }
    }
    
}
