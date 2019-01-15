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

    public static void main(String[] args) {
        LeetCode136 code = new LeetCode136();
        int[] nums = new int[]{4,1,2,1,2};
        System.out.println(code.singleNumber(nums));
    }
}
