
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
    public void pivotIndex() {
        Solution solution = new Solution();
        int[] nums = new int[]{1,7,3,6,5,6};
        System.out.println(solution.pivotIndex(nums));
    }
}