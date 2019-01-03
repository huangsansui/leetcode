package reverse;

/**
 * Function:
 *
 * @author Huangqing
 * @date 2018/12/29 11:58
 * @since JKD 1.8
 */
public class Solution {

    public String reverseString(String s) {
        if (s == null || s.length() <= 0) {
            return "";
        }
        char[] array = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            array[i] = s.charAt(s.length() - i - 1);
            array[s.length() - i - 1] = s.charAt(i);
        }
        return new String(array);
    }

}
