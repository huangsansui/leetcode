package binary;

/**
 * Function:
 *
 * @author: Huangqing
 * @Date: 2018/12/28
 * @since: JDK 1.8
 */
public class Solution {
    public String addBinary(String a, String b) {
        int lengthA = a.length() - 1;
        int lengthB = b.length() - 1;
        int carries = 0;
        StringBuffer sb = new StringBuffer();
        while (lengthA >= 0 || lengthB >= 0) {
            int x = (lengthA >= 0) ? a.charAt(lengthA) - '0' : 0;
            int y = (lengthB >= 0) ? b.charAt(lengthB) - '0' : 0;
            int sum = x + y + carries;
            sb.append(sum % 2);
            carries = sum / 2;
            lengthA--;
            lengthB--;
        }
        if (carries > 0) {
            sb.append(carries);
        }
        return sb.reverse().toString();
    }
}
