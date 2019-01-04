package rotate;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Function:
 *
 * @author Huangqing
 * @date 2019/1/4 15:51
 * @since JKD 1.8
 */
public class SolutionTest {

    @Test
    public void rotate() {
        Solution solution = new Solution();
        int[] nums = new int[]{1, 2};
        solution.rotate(nums, 3);
        for (int n : nums) {
            System.out.print(n + " ");
        }
    }
}