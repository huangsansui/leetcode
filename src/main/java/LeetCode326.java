/**
 * Function:
 *
 * @author Huangqing
 * @date 2019/1/23 10:35
 * @since JKD 1.8
 */
public class LeetCode326 {
    public boolean isPowerOfThree(int n) {
        if (n <= 0) return false;
        while (n > 0) {
            if (n > 1 && n % 3 != 0) {
                return false;
            }
            n /= 3;
        }
        return true;
    }

    public static void main(String[] args) {
        LeetCode326 code = new LeetCode326();
        System.out.println(code.isPowerOfThree(27));

    }
}
