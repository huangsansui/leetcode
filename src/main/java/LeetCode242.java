import java.util.HashMap;
import java.util.Map;

/**
 * Function:
 *
 * @author: Huangqing
 * @Date: 2019/4/4
 * @since: JDK 1.8
 */
public class LeetCode242 {

    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0 ; i < s.length() ; i++) {
            char c = s.charAt(i);
            if (map.get(c) == null) {
                map.put(c, 1);
            } else {
                map.put(c, map.get(c) + 1);
            }
        }
        for(int j = 0 ; j < t.length() ; j ++) {
            char c = t.charAt(j);
            if (map.get(c) == null) {
                return false;
            } else if (map.get(c) > 0) {
                map.put(c, map.get(c) - 1);
            }
        }
        for (Integer n : map.values()) {
            if (n != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        LeetCode242 code = new LeetCode242();
        System.out.println(code.isAnagram("cat", "rat"));
    }
}
