public class findSteps {

    public static int climbStairs(int n) {
        if (n <= 1) {
            return 1;
        }

        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
            System.out.println(dp[i]);
        }

        System.out.println(dp.toString());

        return dp[n];
    }


    public static void main(String[] args) {
        System.out.println(climbStairs(4));
    }
}
