/**
 * TODO
 *
 * @author huangqing
 * @date 2022/4/17 10:41
 */
public class LeetCode6070 {

    public String digitSum(String s, int k) {
        int len = k;
        StringBuffer sb = new StringBuffer(s);
        while (sb.length() > k) {
            int tmp = 0;
            StringBuffer tmpSb = new StringBuffer();
            for (int i = 0; i < sb.length(); i++) {
                tmp += sb.charAt(i) - '0';
                len--;
                if (len == 0 || i == sb.length() - 1) {
                    tmpSb.append(tmp);
                    len = k;
                    tmp = 0;
                }
            }
            sb = tmpSb;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        LeetCode6070 solution = new LeetCode6070();
        solution.digitSum("11111222223", 3);
    }
}
