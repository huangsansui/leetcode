import java.util.ArrayList;
import java.util.List;

/**
 * Function:
 *
 * @author: Huangqing
 * @Date: 2019/1/13
 * @since: JDK 1.8
 */
public class LeetCode119 {

    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();
        if (rowIndex == 0) {
            result.add(1);
            return result;
        }
        for (int i=0;i <= rowIndex;i++) {
            for (int j=0;j<result.size()-1;j++) {
                result.set(j, result.get(j) + result.get(j + 1));
            }
            result.add(0, 1);
        }
        return result;
    }

    public static void main(String[] args) {
        LeetCode119 code = new LeetCode119();
        List list = code.getRow(3);
    }
}
