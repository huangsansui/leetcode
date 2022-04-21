/**
 * Function:
 *
 * @author Huangqing
 * @date 2019/1/30 16:36
 * @since JKD 1.8
 */
public class LeetCode509 {

    public int fib(int N) {
        int sum = 0;
        if (N == 0) {
            return 0;
        }
        if (N == 1) {
            return 1;
        }
        return fib(N - 1) + fib(N - 2);
    }

    public int fib1(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        return helper(dp, n);
    }

    private int helper(int[] dp, int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        if (dp[n] != 0) {
            return dp[n];
        }
        dp[n] = helper(dp, n - 1) + helper(dp, n - 2);
        return dp[n];
    }

    public int fib2(int n) {
        if (n < 1) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        int pre = 1, cur = 1;
        for (int i = 3; i <= n; i++) {
            int sum = pre + cur;
            pre = cur;
            cur = sum;
        }
        return cur;
    }

    public static void main(String[] args) {
        LeetCode509 code = new LeetCode509();
        System.out.println(code.fib(4));
    }
}
