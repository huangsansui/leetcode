/**
 * Function:
 *
 * @author Huangqing
 * @date 2019/1/24 10:55
 * @since JKD 1.8
 */
public class LeetCode367 {
    public boolean isPerfectSquare(int num) {
        long r = num;
        long n = num;
        while (n * n >= r) {
            if (n * n == r) {
                return true;
            }
            // 简化得 n * n = r
            n = (n + r / n) / 2;
        }
        return false;
    }

    public static void main(String[] args) {
        LeetCode367 code = new LeetCode367();
        System.out.println(code.isPerfectSquare(808201));
    }
}
