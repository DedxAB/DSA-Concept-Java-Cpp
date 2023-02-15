package arnab.DSA;

import java.util.Scanner;

public class Ded_08_find_square_root_of_x {
    static double findSqrt(int num) {
        int start = 0;
        int end = num;
        double mid = start + (end - start) / 2;
        double ans = -1;
        while (start <= end) {
            Double n = mid*mid;
            if (n == num) {
                return mid;
            }
            if (n < num) {
                start = (int) (mid + 1);
                ans = mid;
            }
            else {
                end = (int) (mid - 1);
            }
            mid = start + (end - start) / 2;
        }
        return ans;
    }
    public static void main(String[] args) {
        //you are not allowed to use any built in function like pow()
        System.out.println("Enter a number ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        double sqrtOfNum = findSqrt(num);
        System.out.println("Square root of " + num + " = " + (int)sqrtOfNum);
        sc.close();
    }
    
}
