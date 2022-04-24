package contest;

import java.util.*;

/**
 * TODO
 *
 * @author huangqing
 * @date 2022/4/24 11:45
 */
public class Solution {

    public List<Integer> intersection(int[][] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                map.put(nums[i][j], map.getOrDefault(nums[i][j], 0) + 1);
            }
        }
        List<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == nums.length) {
                list.add(entry.getKey());
            }
        }
        Collections.sort(list);
        return list;
    }
}
