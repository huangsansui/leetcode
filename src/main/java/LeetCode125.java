/**
 * Function:
 *
 * @author Huangqing
 * @date 2019/1/14 11:22
 * @since JKD 1.8
 */
public class LeetCode125 {

    public boolean isPalindrome(String s) {
        if (s.isEmpty()) {
            return true;
        }
        int i = 0;
        int j = s.length() - 1;
        while (i <= j) {
            char c1 = s.charAt(i);
            char c2 = s.charAt(j);
            if (!Character.isLetterOrDigit(c1)) {
                i++;
            }else if (!Character.isLetterOrDigit(c2)) {
                j--;
            }else {
                if (!(Character.toLowerCase(c1) == Character.toLowerCase(c2))) {
                    return false;
                }
                i++;
                j--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        LeetCode125 code = new LeetCode125();
        System.out.println(code.isPalindrome("A man, a plan, a canal: Panama"));
    }
}
