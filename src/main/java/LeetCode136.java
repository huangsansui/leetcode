import java.util.HashSet;
import java.util.Set;

/**
 * Function:
 *
 * @author Huangqing
 * @date 2019/1/15 9:17
 * @since JKD 1.8
 */
public class LeetCode136 {

    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                set.remove(nums[i]);
            } else {
                set.add(nums[i]);
            }
        }
        return (int)set.toArray()[0];
    }

    /**
     * XOR (异或运算)
     * 异或运算满足交换律、结合律
     * 1^2^...^n^...^n^...^1000，无论这两个n出现在什么位置，都可以转换成为1^2^...^1000^(n^n)的形式。
     * 其次，对于任何数x，都有x^x=0，x^0=x。
     * @param nums
     * @return
     */
    public int singleNumber1(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result = result ^ nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        LeetCode136 code = new LeetCode136();
        int[] nums = new int[]{4,1,2,1,2};
        System.out.println(code.singleNumber(nums));
    }
}
