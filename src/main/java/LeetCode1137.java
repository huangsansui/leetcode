public class LeetCode1137 {

    public int tribonacci(int n) {
        if (n < 1) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        int pre = 0, mid = 1, cur = 1;
        for (int i = 3; i <= n; i++) {
            int sum = pre + mid + cur;
            pre = mid;
            mid = cur;
            cur = sum;
        }
        return cur;
    }

    /**
     * timeout
     * @param n
     * @return
     */
    public int tribonacci1(int n) {
        if (n < 1) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 1;
        }
        return tribonacci1(n - 1) + tribonacci1(n - 2) + tribonacci1(n - 3);
    }
}
