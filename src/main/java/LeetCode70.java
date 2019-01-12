/**
 * Function:
 *
 * @author: Huangqing
 * @Date: 2019/1/12
 * @since: JDK 1.8
 */
public class LeetCode70 {

    /**
     * 爬楼梯，应用了菲波那切数列
     * @param n
     * @return
     */
    public int climbStairs(int n) {
        if(n == 1 || n == 2) return n;
        int result = climbStairs(n - 1) + climbStairs(n - 2);
        return result;
    }

    public int climbStairs1(int n) {
        int a = 1;
        int b = 1;
        while (n-- > 0) {
            b = b + a;
            a = b - a;
        }
        return a;
    }

    public static void main(String[] args) {
        LeetCode70 code = new LeetCode70();
        System.out.println(code.climbStairs(4));
    }
}
