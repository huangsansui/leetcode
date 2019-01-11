/**
 * Function:
 *
 * @author Huangqing
 * @date 2019/1/11 11:08
 * @since JKD 1.8
 */
public class LeetCode66 {

    public int[] plusOne(int[] digits) {
        digits[digits.length - 1]++;
        for (int i = digits.length - 1; i > 0; i--) {
            if (digits[i] == 10) {
                digits[i] = 0;
                digits[i - 1]++;
            }
        }
        if (digits[0] == 10) {
            digits = new int[digits.length + 1];
            digits[0] = 1;
        }
        return digits;
    }

    public static void main(String[] args) {
        LeetCode66 code = new LeetCode66();
        int[] digits = new int[]{8,9,9,9};
        int[] nums = code.plusOne(digits);
        for (int m : nums) {
            System.out.println(m);
        }
    }
}
