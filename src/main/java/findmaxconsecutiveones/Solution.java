package findmaxconsecutiveones;

/**
 * Function:
 *
 * @author: Huangqing
 * @Date: 2019/1/3
 * @since: JDK 1.8
 */
public class Solution {

    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int one = 0;
        for (int n : nums) {
            if (n == 1) {
                one++;
            } else {
                one = 0;
            }
            max = Math.max(max, one);
        }
        return max;
    }
}
