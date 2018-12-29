package longestcommonprefix;

/**
 * Function:
 *
 * @author: Huangqing
 * @Date: 2018/12/28
 * @since: JDK 1.8
 */
public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length < 1) {
            return "";
        }
        String str = strs[0];
        for (int i=0;i<strs[0].length();i++) {
            int count = 0;
            for(int j=1; j<strs.length;j++) {
                if (strs[j].indexOf(str) == 0) {
                    count++;
                }
            }
            if (count == strs.length - 1) {
                return str;
            } else {
                str = str.substring(0, str.length() - 1);
            }

        }
        return "";
    }
}
