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

    /**
     * 动态规划
     * @param nums
     * @return
     */
    public int maxSubArray1(int[] nums) {

        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 1] + nums[i], nums[i]);
            res = Math.max(res, dp[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        LeetCode53 soultion = new LeetCode53();
        soultion.maxSubArray1(new int[]{-2,1,-3,4,-1,2,1,-5,4});
    }

}
