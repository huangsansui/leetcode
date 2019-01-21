import java.util.HashMap;
import java.util.HashSet;

/**
 * Function:
 *
 * @author Huangqing
 * @date 2019/1/21 18:31
 * @since JKD 1.8
 */
public class LeetCode219 {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>(16);
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                if (Math.abs(map.get(nums[i]) - i) <= k) {
                    return true;
                }
            }
            map.put(nums[i], i);
        }
        return false;
    }

    public static void main(String[] args) {
        LeetCode219 code = new LeetCode219();
        int[] nums = new int[]{1,2,3,1,2,3};
        System.out.println(code.containsNearbyDuplicate(nums, 2));
    }
}
