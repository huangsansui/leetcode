import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Function:
 *
 * @author: Huangqing
 * @Date: 2019/4/4
 * @since: JDK 1.8
 */
public class LeetCode350 {

    public int[] intersect(int[] nums1, int[] nums2) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0 ; i < nums1.length ; i ++) {
            if (map.get(nums1[i]) == null) {
                map.put(nums1[i], 1);
            } else {
                map.put(nums1[i], map.get(nums1[i]) + 1);
            }
        }
        List<Integer> list = new ArrayList<>();
        for (int j = 0 ; j < nums2.length ; j ++) {
            if (map.get(nums2[j]) != null && map.get(nums2[j]) > 0) {
                map.put(nums2[j], map.get(nums2[j]) - 1);
                list.add(nums2[j]);
            }
        }
        int[] res = new int[list.size()];
        for (int k = 0 ; k < list.size() ; k ++) {
            res[k] = list.get(k);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        LeetCode350 code = new LeetCode350();
        int[] res = code.intersect(nums1, nums2);
        for (int n : res) {
            System.out.println(n);
        }
    }
}
