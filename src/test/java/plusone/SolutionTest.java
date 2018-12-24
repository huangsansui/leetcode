package plusone;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Function:
 *
 * @author: Huangqing
 * @Date: 2018/12/24
 * @since: JDK 1.8
 */
public class SolutionTest {

    @Test
    public void plusOne() {
        Solution solution = new Solution();
        System.out.println(solution.plusOne(new int[]{1,2,3}));
    }
}