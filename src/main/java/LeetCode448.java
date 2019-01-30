import java.util.*;

/**
 * Function:
 *
 * @author Huangqing
 * @date 2019/1/30 15:13
 * @since JKD 1.8
 */
public class LeetCode448 {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int ret = Math.abs(nums[i]) - 1;
            if (nums[ret] > 0) {
                nums[ret] = -nums[ret];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                list.add(i + 1);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        LeetCode448 code = new LeetCode448();
        int[] nums = new int[]{4, 3, 2, 7, 8, 2, 3, 1};
        code.findDisappearedNumbers(nums);
    }
}
