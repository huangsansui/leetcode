/**
 * Function:
 *
 * @author Huangqing
 * @date 2019/1/11 10:47
 * @since JKD 1.8
 */
public class LeetCode58 {

    public int lengthOfLastWord(String s) {
        String[] str = s.split(" ");
        return  str.length > 0 ? str[str.length - 1].length() : 0;
    }

    public int lengthOfLastWord1(String s) {
        int len = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                len++;
            } else if (len == 0) {
                continue;
            } else {
                break;
            }
        }
        return len;
    }

    public static void main(String[] args) {
        LeetCode58 code = new LeetCode58();
        System.out.println(code.lengthOfLastWord1("a "));
    }
}
