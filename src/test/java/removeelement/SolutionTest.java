package removeelement;

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
    public void removeElement() {
        int[] nums = new int[]{1, 4, 3, 2, 6};
        Solution solution = new Solution();
        solution.removeElement(nums, 3);
        for (int n : nums) {
            System.out.print(n + " ");
        }
    }
}