package pivot;

/**
 * Function:
 *
 * @author: Huangqing
 * @Date: 2018/12/24
 * @since: JDK 1.8
 */
public class Solution {

    public int pivotIndex(int[] nums) {
        int leftSum = 0;
        int rightSum;
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }
        for (int i=0;i<nums.length;i++) {
            if (i == 0) {
                leftSum = 0;
            } else {
                leftSum += nums[i - 1];
            }
            rightSum = sum - leftSum - nums[i];
            if (leftSum == rightSum){
                return i;
            }
        }

        return -1;
    }
}
