package twosum;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Function:
 *
 * @author Huangqing
 * @date 2019/1/3 10:32
 * @since JKD 1.8
 */
public class SolutionTest {

    @Test
    public void twoSum() {
        Solution solution = new Solution();
        int[] nums = new int[]{2, 7, 11, 15};
        int[] index = solution.twoSum(nums, 9);
        System.out.println(index[0] + " " + index[1]);
    }
}