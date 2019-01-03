package arraypairsum;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Function:
 *
 * @author Huangqing
 * @date 2019/1/3 10:21
 * @since JKD 1.8
 */
public class SolutionTest {

    @Test
    public void arrayPairSum() {
        Solution solution = new Solution();
        int[] nums = new int[]{3, 1, 4, 2};
        System.out.println(solution.arrayPairSum(nums));
    }
}