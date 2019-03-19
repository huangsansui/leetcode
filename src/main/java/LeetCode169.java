/**
 * Function:
 *
 * @author Huangqing
 * @date 2019/1/16 10:37
 * @since JKD 1.8
 */
public class LeetCode169 {

    public int majorityElement(int[] nums) {
        int result = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (count == 0) {
                count++;
                result = nums[i];
            } else if (result == nums[i]) {
                count++;
            } else {
                count--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        LeetCode169 code = new LeetCode169();
        int[] nums = new int[]{2,2,1,1,1,2,2};
        System.out.println(code.majorityElement(nums));
    }
}
