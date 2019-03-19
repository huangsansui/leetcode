/**
 * Function:
 *
 * @author Huangqing
 * @date 2019/1/22 11:36
 * @since JKD 1.8
 */
public class LeetCode236 {

    public boolean isUgly(int num) {
        if (num < 0) {
            return false;
        }
        while (num > 1) {
            if (num % 2 == 0) {
                num /= 2;
            } else if (num % 3 == 0) {
                num /= 3;
            } else if (num % 5 == 0) {
                num /= 5;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        LeetCode236 code = new LeetCode236();
        System.out.println(code.isUgly(14));
    }
}
