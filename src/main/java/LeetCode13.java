import java.util.HashMap;
import java.util.Map;

/**
 * Function:
 *
 * @author Huangqing
 * @date 2019/1/7 18:26
 * @since JKD 1.8
 */
public class LeetCode13 {

    private static Map<Character, Integer> roman = new HashMap();

    static {
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);
    }

    public int romanToInt(String s) {
        int rev = 0;
        for (int i = 0; i < s.length(); i++) {
            int temp = roman.get(s.charAt(i));
            if (i != s.length() - 1) {
                if (temp < roman.get(s.charAt(i + 1))) {
                    temp = -temp;
                }
            }
            rev += temp;
        }
        return rev;
    }

    public static void main(String[] args) {
        LeetCode13 code = new LeetCode13();
        System.out.println(code.romanToInt("IV"));
    }
}
