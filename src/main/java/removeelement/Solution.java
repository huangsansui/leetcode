package removeelement;

/**
 * Function:
 *
 * @author: Huangqing
 * @Date: 2019/1/3
 * @since: JDK 1.8
 */
public class Solution {

    public int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i=0;i<nums.length;i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}
