package plusone;

/**
 * Function:
 *
 * @author: Huangqing
 * @Date: 2018/12/24
 * @since: JDK 1.8
 */
public class Solution {
    public int[] plusOne(int[] digits) {
        if (digits[digits.length - 1] != 9) {
            digits[digits.length - 1]++;
            return digits;
        }
        if (digits.length == 1) {
            digits[0]++;
        } else {
            for (int i = digits.length - 1; i > 0; i--) {
                if (i == digits.length - 1) {
                    digits[i]++;
                }
                if (digits[i] == 10) {
                    digits[i] = 0;
                    digits[i - 1] = digits[i - 1] + 1;
                }
            }
        }
        if (digits[0] == 10) {
            digits = new int[digits.length + 1];
            for (int i=0;i<digits.length;i++) {
                if (i == 0) {
                    digits[0] = 1;
                } else if (i == 1) {
                    digits[1] = 0;
                } else{ digits[i] = digits[i - 1];}
            }
            return digits;
        }
        return digits;
    }
}
