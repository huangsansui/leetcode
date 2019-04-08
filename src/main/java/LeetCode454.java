import java.util.HashMap;
import java.util.Map;

/**
 * Function:
 *
 * https://leetcode.com/problems/4sum-ii/
 *
 * @author: Huangqing
 * @Date: 2019/4/8
 * @since: JDK 1.8
 */
public class LeetCode454 {

    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        Map<Integer, Integer> map = new HashMap<>(16);
        int res = 0;
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < D.length; j++) {
                if (map.containsKey(C[i] + D[j])) {
                    map.put(C[i] + D[j], map.get(C[i] + D[j]) + 1);
                } else {
                    map.put(C[i] + D[j], 1);
                }

            }
        }
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                if (map.containsKey(0 - A[i] - B[j])) {
                    res += map.get(0 - A[i] - B[j]);
                }
            }
        }
        return res;
    }
}
