/**
 * Function:
 *
 * @author Huangqing
 * @date 2019/1/24 10:03
 * @since JKD 1.8
 */
public class LeetCode344 {

    public void reverseString(char[] s) {
        int i = 0;
        int j = s.length - 1;
        while (i < j) {
            char c = s[i];
            s[i++] = s[j];
            s[j--] = c;
        }
    }

    public void reverseString1(char[] s) {
       int mid = s.length / 2;
        for (int i = 0; i < mid; i++) {
            char c = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i - 1] = c;
        }
    }

    public static void main(String[] args) {
        LeetCode344 code = new LeetCode344();
        char[] s = new char[]{'h','e','l','l','o'};
        code.reverseString(s);
        for (char c : s) {
            System.out.print(c + " ");
        }
    }
}
