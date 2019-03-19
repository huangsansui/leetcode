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

    public static void main(String[] args) {
        LeetCode509 code = new LeetCode509();
        System.out.println(code.fib(4));
    }
}
