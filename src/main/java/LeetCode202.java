import java.util.HashSet;
import java.util.Set;

/**
 * Function:
 *
 * @author Huangqing
 * @date 2019/1/17 11:09
 * @since JKD 1.8
 */
public class LeetCode202 {

    public boolean isHappy(int n) {
        Set<Integer> inLoop = new HashSet<Integer>();
        int squareSum,remain;
        while (inLoop.add(n)) {
            squareSum = 0;
            while (n > 0) {
                remain = n%10;
                squareSum += remain*remain;
                n /= 10;
            }
            if (squareSum == 1)
                return true;
            else
                n = squareSum;

        }
        return false;
    }

    public static void main(String[] args) {
        LeetCode202 code = new LeetCode202();
        System.out.println(code.isHappy(2));
    }
}
