package plusone;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Function:
 *
 * @author: Huangqing
 * @Date: 2018/12/25
 * @since: JDK 1.8
 */
public class SolutionOneTest {

    @Test
    public void plusOne() {
        SolutionOne solution = new SolutionOne();
        int[] digits = new int[]{9, 9, 9};
        int[] ints = solution.plusOne(digits);
        for (int n : ints) {
            System.out.println(n);
        }
    }
}