package triangle;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Function:
 *
 * @author Huangqing
 * @date 2019/1/4 16:36
 * @since JKD 1.8
 */
public class SolutionTest {

    @Test
    public void getRow() {
        Solution solution = new Solution();
        List<Integer> row = solution.getRow(3);
        System.out.println(row);
    }
}