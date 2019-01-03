package findmaxconsecutiveones;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Function:
 *
 * @author: Huangqing
 * @Date: 2019/1/3
 * @since: JDK 1.8
 */
public class SolutionTest {

    @Test
    public void findMaxConsecutiveOnes() {
        int[] nums = new int[]{1, 0, 1, 1, 0, 1};
        Solution solution = new Solution();
        System.out.println(solution.findMaxConsecutiveOnes(nums));
    }
}