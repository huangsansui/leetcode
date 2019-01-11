/**
 * Function:
 *
 * @author: Huangqing
 * @Date: 2019/1/11
 * @since: JDK 1.8
 */
public class LeetCode53 {

    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int sum = 0;
        for (int i=0;i<nums.length;i++) {
            sum += nums[i];
            if (sum > max) {
                max = sum;
            }
            // 如果sum < 0,不管nums[i + 1]是正数还是负数，
            // 都有 sum + nums[i + 1] < nums[i + 1]
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }
}
