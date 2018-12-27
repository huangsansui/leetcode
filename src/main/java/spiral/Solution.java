package spiral;

import java.util.ArrayList;
import java.util.List;

/**
 * Function:
 *
 * @author: Huangqing
 * @Date: 2018/12/28
 * @since: JDK 1.8
 */
public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        if (matrix.length == 0) {
            return new ArrayList<>();
        }
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> list = new ArrayList<>(m * n);
        int r = 0;
        int c = 0;
        boolean right = true;
        boolean down = true;
        for (int i = 0; i < list.size(); i++) {
            list.add(matrix[r][c]);

        }
        return list;
    }
}
