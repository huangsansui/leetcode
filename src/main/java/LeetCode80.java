/**
 * Function:
 *
 * @author: Huangqing
 * @Date: 2019/4/2
 * @since: JDK 1.8
 */
public class LeetCode80 {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        for (int i = 0 ; i < nums.length ; i++) {
            if (k < 2 || nums[i] > nums[k - 2]) {
                nums[k++] = nums[i];
            }
        }
        return k;
    }

    public static void main(String[] args) {
        LeetCode80 code = new LeetCode80();
        int[] nums = {1, 1, 1, 2, 2, 3};
        code.removeDuplicates(nums);
        for (int n : nums) {
            System.out.println(n);
        }
    }
}
