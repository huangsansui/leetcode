import java.util.Stack;

/**
 * Function:
 *
 * @author Huangqing
 * @date 2019/1/8 15:54
 * @since JKD 1.8
 */
public class LeetCode20 {

    /**
     * TODO: 2019/1/8 can't solute it !!
     * 8ms
    */
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else if (stack.isEmpty() || stack.pop() != c) {
                return false;
            }
        }
        return stack.isEmpty();
    }

    public boolean isValid1(String s) {
        char[] stack = new char[s.length()];
        int head = 0;
        for (char c : s.toCharArray()) {
            switch (c) {
                case '{':
                case '[':
                case '(':
                    stack[head++] = c;
                    break;
                case '}':
                    if (head == 0 || stack[--head] != '}') {
                        return false;
                    }
                    break;
                case ']':
                    if (head == 0 || stack[--head] != '[') {
                        return false;
                    }
                    break;
                case ')':
                    if (head == 0 || stack[--head] != '(') {
                        return false;
                    }
                    break;
            }
        }
        return head == 0;
    }

    public static void main(String[] args) {
        LeetCode20 code = new LeetCode20();
        code.isValid1("(]");
    }
}
