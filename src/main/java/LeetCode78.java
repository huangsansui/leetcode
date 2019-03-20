import java.util.ArrayList;
import java.util.List;

/**
 * Function:
 *
 * @author Huangqing
 * @date 2019/1/30 17:27
 * @since JKD 1.8
 */
public class LeetCode78 {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i <= nums.length; i++) {
            List<Integer> list = new ArrayList<>();

            for (int j = 0; j < nums.length - i; j++) {

            }
            result.add(list);
        }
        return result;
    }
}
