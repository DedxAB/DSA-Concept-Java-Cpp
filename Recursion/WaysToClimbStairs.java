package arnab.DSA.Recursion;

import java.util.Scanner;

public class WaysToClimbStairs {
    public static void main(String[] args) {
        // Qs: You have been given a number of stairs. Ititially you are at the 0th
        // stair and you need to reach the endth stair. Each time you can eather climb
        // one step or two steps. You are supposed to return the number of distinct ways
        // in which you can climb from the 0th step nth step

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the last stair: ");
            int nthStair = sc.nextInt();
            int ans = countDistinctWays(nthStair);
            System.out.println(ans + " ways to reach to the last stair.");
        }
    }

    static int countDistinctWays(int nthStair) {
        // base condition
        if (nthStair == 0)
            return 1;
        if (nthStair < 0)
            return 0;

        // recursion relation
        int ans = countDistinctWays(nthStair - 1) + countDistinctWays(nthStair - 2);
        return ans;
    }
}
