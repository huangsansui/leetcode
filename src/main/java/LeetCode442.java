import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Function:
 *
 * @author Huangqing
 * @date 2019/1/28 14:24
 * @since JKD 1.8
 */
public class LeetCode442 {

    public List<Integer> findDuplicates(int[] nums) {
            List<Integer> list = new ArrayList<>();
            Set<Integer> set = new HashSet<>();
            for (int i = 0; i < nums.length; i++) {
                if (!set.add(nums[i]) && !list.contains(nums[i])) {
                    list.add(nums[i]);
                }
            }
            return list;
    }

    public static void main(String[] args) {
        LeetCode442 code = new LeetCode442();
        int[] nums = new int[]{4, 3, 2, 7, 8, 2, 3, 1};
        code.findDuplicates(nums);
    }
}
