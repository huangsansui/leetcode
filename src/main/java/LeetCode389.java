import java.util.HashMap;
import java.util.Set;

/**
 * Function:
 *
 * @author Huangqing
 * @date 2019/1/25 11:58
 * @since JKD 1.8
 */
public class LeetCode389 {

    public char findTheDifference(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            if (map.get(t.charAt(i)) == null) {
                map.put(t.charAt(i), 1);
            } else {
                map.put(t.charAt(i), map.get(t.charAt(i)) + 1);
            }
        }
        for (int j = 0; j < s.length(); j++) {
            char c = s.charAt(j);
            map.put(c, map.get(c) - 1);
            if (map.get(c) == 0) {
                map.remove(c);
            }
        }
        Set set = map.keySet();
        return (char)set.toArray()[0];
    }

    public static void main(String[] args) {
        LeetCode389 code = new LeetCode389();
        System.out.println(code.findTheDifference("abcd", "abced"));
    }
}
