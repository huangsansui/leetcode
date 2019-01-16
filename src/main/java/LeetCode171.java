/**
 * Function:
 *
 * @author Huangqing
 * @date 2019/1/16 10:45
 * @since JKD 1.8
 */
public class LeetCode171 {

    public int titleToNumber(String s) {
        int result = 0;
        for (int i = s.length() - 1; i >=0 ; i--) {
            int n = s.charAt(i) - 'A' + 1;
            result += Math.pow(26, s.length() - 1 - i) * n;
        }
        return result;
    }

    public static void main(String[] args) {
        LeetCode171 code = new LeetCode171();
        System.out.println(code.titleToNumber("AB"));
    }
}
