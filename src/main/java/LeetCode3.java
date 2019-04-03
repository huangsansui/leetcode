import java.util.HashMap;
import java.util.Map;

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


        Map<Character, Integer> map =new HashMap<>();
        int l = 0;
        int r = -1;
        int res = 0;
        while (l < s.length()) {
            if (r + 1 < s.length() && !map.containsKey(s.charAt(r + 1))) {
                r++;
                map.put(s.charAt(r), r);
            } else {
                l = map.get(s.charAt(r + 1));
                l++;
            }
            res = Math.max(res, r - l + 1);
        }
        return res;
    }

    public static void main(String[] args) {
        LeetCode3 code = new LeetCode3();
        System.out.println(code.lengthOfLongestSubstring("dvdf"));
    }
}
