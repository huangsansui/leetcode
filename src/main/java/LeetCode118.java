import java.util.*;

/**
 * Function:
 *
 * @author: Huangqing
 * @Date: 2019/1/13
 * @since: JDK 1.8
 */
public class LeetCode118 {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if (numRows == 0) {
            return result;
        }
        int i = 1;
        while (i <= numRows) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < i; j++) {
                if (i == 1) {
                    list.add(1);
                    break;
                }
                if (j == 0 || j == i - 1) {
                    list.add(1);
                } else {
                    list.add(result.get(i - 2).get(j - 1) + result.get(i - 2).get(j));
                }
            }
            result.add(list);
            i++;
        }
        return result;
    }

    public List<List<Integer>> generate1(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        int i = 1;
        while (i <= numRows) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < i; j++) {
                if (j == 0 || j == i - 1) {
                    list.add(1);
                } else {
                    list.add(res.get(i - 2).get(j - 1) + res.get(i - 2).get(j));
                }
            }
            res.add(list);
            i++;
        }
        return res;
    }

        public static void main(String[] args) {
        LeetCode118 code = new LeetCode118();
        List list = code.generate(5);
    }
}
