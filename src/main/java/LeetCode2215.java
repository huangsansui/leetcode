import java.util.*;

public class LeetCode2215 {

    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> res = new ArrayList<>();
        Set<Integer> a1 = new HashSet<>();
        Set<Integer> a2 = new HashSet<>();
        for (int i = 0; i < 2; i ++)
        {
            res.add(new ArrayList<>());
        }
        for (int i : nums1) {
            a1.add(i);
        }
        for (int i : nums2) {
            a2.add(i);
        }
        for (Integer i : a1) {
            if (!a2.contains(i)) {
                res.get(0).add(i);
            }
        }
        for (Integer i : a2) {
            if (!a1.contains(i)) {
                res.get(1).add(i);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        LeetCode2215 solution = new LeetCode2215();
        solution.findDifference(new int[]{1,2,3,3}, new int[]{1,1,2,2});
    }
}
