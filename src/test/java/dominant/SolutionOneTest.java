package dominant;

import dominant.SolutionOne;
import org.junit.Test;

/**
 * Function:
 *
 * @author: Huangqing
 * @Date: 2018/12/24
 * @since: JDK 1.8
 */
public class SolutionOneTest {

    @Test
    public void dominantIndex() {
        SolutionOne solution = new SolutionOne();
        int[] nums = new int[]{0,0,0,1};
        System.out.println(solution.dominantIndex(nums));
    }
}