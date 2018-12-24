package plusone;

/**
 * Function:
 *
 * @author: Huangqing
 * @Date: 2018/12/24
 * @since: JDK 1.8
 */
public class SolutionOne {

    public int[] plusOne(int[] digits) {
        if (digits[digits.length - 1] != 9) {
            digits[digits.length - 1]++;
            return digits;
        }
        boolean flag = false;
        digits[digits.length - 1]++;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (flag) {
                digits[i]++;
                flag = false;
            }
            if (digits[i] == 10) {
                digits[i] = 0;
                flag = true;
            }
            if (i == 0 && digits[i] == 0) {
                digits = new int[digits.length + 1];
                digits[i] = 1;
            }
        }
        return digits;
    }
}
