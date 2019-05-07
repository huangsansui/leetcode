/**
 * Created on 2019/5/7.
 *
 * @author Huangqing
 */
public class LeetCode198 {

    public int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }
        int[] result = new int[nums.length];
        result[0] = nums[0];
        result[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < result.length; i++) {
            result[i] = Math.max(nums[i] + result[i - 2], result[i - 1]);
        }
        return result[result.length - 1];
    }

    public static void main(String[] args) {
        LeetCode198 code = new LeetCode198();
        System.out.println(code.rob(new int[]{2, 1, 1, 9}));
    }
}
