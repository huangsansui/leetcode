package triangle;

import java.util.ArrayList;
import java.util.List;

/**
 * Function:
 *
 * @author Huangqing
 * @date 2019/1/4 16:32
 * @since JKD 1.8
 */
public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < rowIndex + 1; i++) {
            if (i == 0 || i == rowIndex) {
                list.add(1);
            } else {
                list.add(getRow(rowIndex - 1).get(i - 1) + getRow(rowIndex - 1).get(i));
            }
        }
        return list;
    }
}
