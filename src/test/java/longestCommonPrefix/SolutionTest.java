package longestCommonPrefix;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Function:
 *
 * @author: Huangqing
 * @Date: 2018/12/28
 * @since: JDK 1.8
 */
public class SolutionTest {

    @Test
    public void longestCommonPrefix() {
        Solution solution = new Solution();
        String[] strs = new String[]{"flower", "flow", "flight"};
        solution.longestCommonPrefix(strs);
    }
}