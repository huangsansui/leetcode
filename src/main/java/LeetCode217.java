import java.util.HashMap;
import java.util.HashSet;

/**
 * Function:
 *
 * @author Huangqing
 * @date 2019/1/21 18:13
 * @since JKD 1.8
 */
public class LeetCode217 {

    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        LeetCode217 code = new LeetCode217();
        int[] nums = new int[]{1,2,3,4};
        System.out.println(code.containsDuplicate(nums));
    }
}
