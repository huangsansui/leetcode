/**
 * TODO
 *
 * @author huangqing
 * @date 2022/4/17 00:52
 */
public class LeetCode6060 {

    public int findClosestNumber(int[] nums) {
        int max = Integer.MAX_VALUE;
        for (int i : nums){
            if (i > 0) {
                if (i <= Math.abs(max)) {
                    max = i;
                }
            } else {
                if (Math.abs(i) < Math.abs(max)) {
                    max = i;
                }
            }
        }
        return max;
    }
}
