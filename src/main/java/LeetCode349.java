import java.util.*;

/**
 * Function:
 *
 * @author Huangqing
 * @date 2019/1/23 10:45
 * @since JKD 1.8
 */
public class LeetCode349 {

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> intersect = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }
        for (int j = 0; j < nums2.length; j++) {
            if (set.contains(nums2[j])) {
                intersect.add(nums2[j]);
            }
        }
        int[] result = new int[intersect.size()];
        int i = 0;
        for (Integer entry : intersect) {
            result[i++] = entry;
        }
        return result;
    }

    public static void main(String[] args) {
        LeetCode349 code = new LeetCode349();
        int[] nums1 = new int[]{4,9,5};
        int[] nums2 = new int[]{9,4,9,8,4};
        int[] result = code.intersection(nums1, nums2);
        for (int num : result) {
            System.out.println(num);
        }
    }
}
