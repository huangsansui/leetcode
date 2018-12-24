package dominant;

import dominant.Solution;
import org.junit.Test;

/**
 * Function:
 *
 * @author: Huangqing
 * @Date: 2018/12/24
 * @since: JDK 1.8
 */
public class SolutionTest {

    @Test
    public void dominantIndex() {
        Solution solution = new Solution();
        int[] nums = new int[]{0,0,0,1};
        System.out.println(solution.dominantIndex(nums));
    }
}