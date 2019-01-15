/**
 * Function:
 *
 * @author: Huangqing
 * @Date: 2019/1/16
 * @since: JDK 1.8
 */
public class LeetCode168 {
    public String convertToTitle(int n) {
        StringBuffer sb = new StringBuffer();
        do {
            n--;
            int i = n % 26;
            n /= 26;
            sb.append((char)(i + 'A'));
        } while (n > 0);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        LeetCode168 code = new LeetCode168();
        System.out.println(code.convertToTitle(701));
    }
}
