package dominant;

/**
 * Function:
 *
 * @author: Huangqing
 * @Date: 2018/12/24
 * @since: JDK 1.8
 */
public class Solution {

    public int dominantIndex(int[] nums) {
        int count = 0;
        // 复杂度 O(n^2)
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] >= nums[j] * 2) {
                    count++;
                }
            }
            if (count == nums.length - 1) {
                return i;
            }
            count = 0;
        }
        return -1;
    }
}
