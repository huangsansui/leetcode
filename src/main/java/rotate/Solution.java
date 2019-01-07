package rotate;

/**
 * Function:
 *
 * @author Huangqing
 * @date 2019/1/4 15:39
 * @since JKD 1.8
 */
public class Solution {

    public void rotate(int[] nums, int k) {
        for (int i = 0; i < k; i++) {
            int temp = nums[nums.length - 1];
            for (int j = nums.length - 1; j > 0; j--) {
                nums[j] = nums[j - 1];
            }
            nums[0] = temp;
        }
    }
}
