import java.util.LinkedList;
import java.util.Queue;

/**
 * Function:
 *
 * https://leetcode.com/problems/move-zeroes/
 *
 * @author: Huangqing
 * @Date: 2019/4/1
 * @since: JDK 1.8
 */
public class LeetCode283 {

    public void moveZeroes(int[] nums) {
        // Solution 1
        int k = 0;
        for (int i = 0 ; i < nums.length ; i++) {
            if (nums[i] != 0) {
                if (k != i) {
                    swap(nums[k++], nums[i]);
                } else {
                    k++;
                }
            }
        }
    }

    private void swap(int i, int j) {
        int temp = i;
        i = j;
        j = temp;
    }

    public static void main(String[] args) {
//        int[] nums = {0, 1, 0, 3, 12};
        int[] nums = {0, 0, 1};
        LeetCode283 code = new LeetCode283();
        code.moveZeroes(nums);
        for (int n : nums) {
            System.out.println(n);
        }
    }
}
