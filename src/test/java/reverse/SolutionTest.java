package reverse;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Function:
 *
 * @author Huangqing
 * @date 2018/12/29 12:02
 * @since JKD 1.8
 */
public class SolutionTest {

    @Test
    public void reverseString() {
        Solution solution = new Solution();
        String str = solution.reverseString("hello");
        System.out.println(str);
    }
}