/**
 * Function:
 *
 * @author: Huangqing
 * @Date: 2019/1/6
 * @since: JDK 1.8
 */
public class LeetCode7 {

    /**
     * 39ms
     * @param x
     * @return
     */
    public int reverse(int x) {
        String s = String.valueOf(x);
        boolean flag = true;
        if (s.charAt(0) == '-') {
            flag = false;
            s = s.substring(1);
        }
        StringBuffer sb = new StringBuffer();
        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        if (Long.parseLong(sb.toString()) > Integer.MAX_VALUE) {
            return 0;
        }
        x = Integer.parseInt(sb.toString());
        if (!flag) {
            x = -x;
        }
        return x;
    }

    /**
     * 15ms
     * @param x
     * @return
     */
    public int reverse1(int x) {
        long res = 0;
        while (x != 0) {
            res = res * 10 + x % 10;
            x /= 10;
            if (res < Integer.MIN_VALUE || res > Integer.MAX_VALUE) {
                return 0;
            }
        }
        return (int) res;
    }

    public static void main(String[] args) {
        LeetCode7 s = new LeetCode7();
        int n = s.reverse(123);
        System.out.println(n);
    }
}
