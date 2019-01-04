package minsubarraylen;

/**
 * Function:
 *
 * @author Huangqing
 * @date 2019/1/4 14:58
 * @since JKD 1.8
 */
public class Solution {

    public int minSubArrayLen(int s, int[] nums) {
        int i = 0;
        int j = -1;
        int total = 0;
        int res = nums.length;
        while (i < nums.length) {
            if (j + 1 < nums.length && s > total) {
                j++;
                total += nums[j];
            } else {
                total -= nums[i];
                i++;
            }
            if (total >= s) {
                res = Math.min(res, j - i + 1);
            }
        }
        if (res == nums.length) {
            return 0;
        }
        return res;
    }
}
