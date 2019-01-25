import java.util.Stack;

/**
 * Function:
 *
 * @author Huangqing
 * @date 2019/1/25 11:17
 * @since JKD 1.8
 */
public class LeetCode921 {

    public int minAddToMakeValid(String S) {
        Stack stack = new Stack();
        int count = 0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '(') {
                stack.push('(');
            } else if (stack.isEmpty()) {
                count++;
            } else {
                stack.pop();
            }
        }
        return count + stack.size();
    }

    public static void main(String[] args) {
        LeetCode921 code = new LeetCode921();
        System.out.println(code.minAddToMakeValid("()))(("));
    }
}
