/**
 * Function:
 *
 * @author: Huangqing
 * @Date: 2019/1/12
 * @since: JDK 1.8
 */
public class LeetCode69 {
    public int mySqrt(int x) {
        long r = x;
        while (r * r > x) {
            r = (r + x/r) / 2;
        }
        return (int)r;
    }

    public static void main(String[] args) {
        LeetCode69 code = new LeetCode69();
        System.out.println(code.mySqrt(16));
    }
}
