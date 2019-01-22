import java.util.HashSet;
import java.util.Set;

/**
 * Function:
 *
 * @author Huangqing
 * @date 2019/1/22 14:15
 * @since JKD 1.8
 */
public class LeetCode268 {

    public int missingNumber(int[] nums) {
        int len = nums.length;
        int[] newArr = new int[len + 1];
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < len; i++) {
            newArr[nums[i]] = nums[i];
        }
        for (int j = 0; j < len + 1; j++) {
            if (!set.add(newArr[j])) {
                return j;
            }
        }
        return 0;
    }

    public int missingNumber1(int[] nums) {
        int missing = nums.length;
        for (int i = 0; i < nums.length; i++) {
            missing = missing ^ i ^ nums[i];
        }
        return missing;
    }

    public static void main(String[] args) {
        LeetCode268 code = new LeetCode268();
        int[] nums = new int[]{0, 1, 3};
        System.out.println(code.missingNumber1(nums));
    }
}
