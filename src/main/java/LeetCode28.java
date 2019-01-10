/**
 * Function:
 *
 * @author Huangqing
 * @date 2019/1/10 10:29
 * @since JKD 1.8
 */
public class LeetCode28 {

    /**
     * 5ms
     * @param haystack
     * @param needle
     * @return
     */
    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    /**
     * 9ms
     * @param haystack
     * @param needle
     * @return
     */
    public int strStr1(String haystack, String needle) {
        if (needle.equals("")) {
            return 0;
        }
        if (haystack.length() < needle.length()) {
            return -1;
        }
        int j;
        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            for (j = 0; j < needle.length(); j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
            }
            if (j == needle.length()) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        LeetCode28 code = new LeetCode28();
        String a = "hadf";
        String b = "f";
        System.out.println(code.strStr(a, b));
    }
}
