/**
 * Function:
 *
 * @author Huangqing
 * @date 2019/1/30 16:31
 * @since JKD 1.8
 */
public class LeetCode485 {

    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        LeetCode485 code = new LeetCode485();
        int[] nums = new int[]{1, 1, 0, 1, 1, 1};
        System.out.println(code.findMaxConsecutiveOnes(nums));
    }
}
