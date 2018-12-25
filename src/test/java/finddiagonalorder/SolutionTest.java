package finddiagonalorder;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Function:
 *
 * @author: Huangqing
 * @Date: 2018/12/25
 * @since: JDK 1.8
 */
public class SolutionTest {

    @Test
    public void findDiagonalOrder() {
        Solution solution = new Solution();
        int[][] nums = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[] result = solution.findDiagonalOrder(nums);
        for (int n : result) {
            System.out.println(n);
        }
    }
}