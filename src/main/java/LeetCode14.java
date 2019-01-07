/**
 * Function:
 *
 * @author: Huangqing
 * @Date: 2019/1/8
 * @since: JDK 1.8
 */
public class LeetCode14 {

    /**
     * 10ms
     * @param strs
     * @return
     */
    public String longestCommonPrefix(String[] strs) {
        String prefix = "";
        if (strs.length <= 0) {
            return prefix;
        }
        int arrLen = strs.length;
        int len = strs[0].length();
        for (int i=0;i < len;i++) {
            String s = strs[0].substring(0, i + 1);
            for (int j=1;j<arrLen;j++) {
                if (!strs[j].startsWith(s)) {
                    return prefix.toString();
                }
            }
            prefix = s;
        }
        return prefix;
    }

    /**
     * 7ms
     * @param strs
     * @return
     */
    public String longestCommonPrefix1(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        int i = 1;
        while (i < strs.length) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
            i++;
        }
        return prefix;
    }

    public static void main(String[] args) {
        String[] strs = new String[]{"flower", "flow", "flight"};
        LeetCode14 code = new LeetCode14();
        System.out.println(code.longestCommonPrefix1(strs));
    }
}
