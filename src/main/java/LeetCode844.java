import java.util.Stack;

/**
 * Function:
 *
 * @author Huangqing
 * @date 2019/1/25 10:59
 * @since JKD 1.8
 */
public class LeetCode844 {

    public boolean backspaceCompare(String S, String T) {
        Stack<Character> stackS = new Stack<>();
        Stack<Character> stackT = new Stack<>();
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '#') {
                if (!stackS.isEmpty()) {
                    stackS.pop();
                }
            } else {
                stackS.push(S.charAt(i));
            }
        }
        for (int i = 0; i < T.length(); i++) {
            if (T.charAt(i) == '#') {
                if (!stackT.isEmpty()) {
                    stackT.pop();
                }
            } else {
                stackT.push(T.charAt(i));
            }
        }
        if (stackS.size() != stackT.size()) {
            return false;
        }
        if (!stackS.containsAll(stackT)) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        LeetCode844 code = new LeetCode844();
        System.out.println(code.backspaceCompare(
                "y#fo##f",
                "y#f#o##f"));
    }
}
