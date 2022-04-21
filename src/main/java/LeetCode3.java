import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Function:
 *
 * @author Huangqing
 * @date 2019/1/18 10:56
 * @since JKD 1.8
 */
public class LeetCode3 {

    public int lengthOfLongestSubstring(String s) {
//        HashMap<Character, Integer> map = new HashMap<>();
//        int max = 0;
//        int j = 0;
//        for (int i = 0; i < s.length(); i++) {
//            if (map.containsKey(s.charAt(i))) {
//                j = Math.max(j, map.get(s.charAt(i)) + 1);
//            }
//            map.put(s.charAt(i), i);
//            max = Math.max(max, i - j + 1);
//        }


        Set<Character> set =new HashSet<>();
        int l = 0;
        int r = 0;
        int res = 0;
        while (l < s.length() && r < s.length()) {
            if (!set.contains(s.charAt(r))) {
                set.add(s.charAt(r++));
                res = Math.max(res, r - l);
            } else {
                set.remove(s.charAt(l++));
            }
        }
        return res;
    }

    public int lengthOfLongestSubstring1(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int j = 0;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                j = Math.max(j, map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i), i);
            max = Math.max(max, i - j + 1);
        }
        return max;
    }

    public static void main(String[] args) {
        LeetCode3 code = new LeetCode3();
        System.out.println(code.lengthOfLongestSubstring("dvdf"));
    }
}
