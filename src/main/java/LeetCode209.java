/**
 * Function:
 *
 * https://leetcode.com/problems/minimum-size-subarray-sum/
 *
 * @author: Huangqing
 * @Date: 2019/4/2
 * @since: JDK 1.8
 */
public class LeetCode209 {

    public int minSubArrayLen(int s, int[] nums) {
        int i = 0;
        int j = -1;
        int size = nums.length;
        int sum = 0;
        int minLen = nums.length + 1;
        while (i < size) {
            if (j + 1 < size && sum < s) {
                j++;
                sum += nums[j];
            } else {
                sum -= nums[i];
                i++;
            }
            if (sum >= s) {
                minLen = Math.min(minLen, j - i + 1);
            }
        }
        if (minLen == nums.length + 1) {
            return 0;
        }
        return minLen;
    }

    public static void main(String[] args) {
        LeetCode209 code = new LeetCode209();
        int[] nums = {2, 3, 1, 2, 4, 3};
        System.out.println(code.minSubArrayLen(7, nums));
    }
}
