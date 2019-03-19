import java.util.HashMap;

/**
 * Function:
 *
 * @author Huangqing
 * @date 2019/1/18 10:56
 * @since JKD 1.8
 */
public class LeetCode3 {

    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0;
        int j = 0;
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
        System.out.println(code.lengthOfLongestSubstring("abba"));
    }
}
