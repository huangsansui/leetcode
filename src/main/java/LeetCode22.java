import java.util.ArrayList;
import java.util.List;

/**
 * Created on 2019/7/23
 *
 * @author qing.huang
 */
public class LeetCode22 {

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        String str = new String();
        backTrace(str, result, 0, 0, n);
        return result;
    }

    private void backTrace(String str, List<String> result, int left, int right, int n) {
        if (left > n || right > n) {
            return;
        }
        if (left == n && right == n) {
            result.add(str);
        }
        if (left >= right) {
            String s = str;
            backTrace(s + "(", result, left + 1, right, n);
            backTrace(s + ")", result, left, right + 1, n);
        }
    }
}
