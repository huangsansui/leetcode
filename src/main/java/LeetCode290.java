import java.util.HashMap;
import java.util.Objects;

/**
 * Function:
 *
 * @author Huangqing
 * @date 2019/1/23 10:08
 * @since JKD 1.8
 */
public class LeetCode290 {

    public boolean wordPattern(String pattern, String str) {
        String[] words = str.split(" ");
        if (words.length != pattern.length()) {
            return false;
        }
        HashMap map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            if (!Objects.equals(map.put(pattern.charAt(i), i),map.put(words[i], i))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        LeetCode290 code = new LeetCode290();
        System.out.println(code.wordPattern("abba", "dog cat cat fish"));
    }
}
