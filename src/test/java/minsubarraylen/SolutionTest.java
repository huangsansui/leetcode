package minsubarraylen;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Function:
 *
 * @author Huangqing
 * @date 2019/1/4 15:31
 * @since JKD 1.8
 */
public class SolutionTest {

    @Test
    public void minSubArrayLen() {
        Solution solution = new Solution();
        int[] nums = new int[]{2, 3, 1, 2, 4, 3};
        System.out.println(solution.minSubArrayLen(7, nums));
    }
}