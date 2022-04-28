/**
 * TODO
 *
 * @author huangqing
 * @date 2022/4/28 11:33
 */
public class LeetCode905 {

    public int[] sortArrayByParity(int[] nums) {
        int i = 0, j = nums.length - 1;
        while (i < j) {
            if (nums[i] % 2 == 1 && nums[j] % 2 == 0) {
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
            } else if (nums[i] % 2 == 1) {
                j--;
            } else if (nums[j] % 2 == 0) {
                i++;
            } else {
                i++;
                j--;
            }
        }
        return nums;
    }
}
