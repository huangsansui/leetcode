/**
 * Function:
 *
 * @author: Huangqing
 * @Date: 2019/1/11
 * @since: JDK 1.8
 */
public class LeetCode38 {

    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        String str = countAndSay(n - 1) + "*";
        int count = 1;
        String result = "";
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                result += String.valueOf(count) + str.charAt(i);
                count = 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        LeetCode38 code = new LeetCode38();
        System.out.println(code.countAndSay(4));
    }
}
