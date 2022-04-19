public class LeetCode557 {

    public String reverseWords(String s) {
        int p = 0;
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            if (i == s.length() - 1) {
                int cur = i;
                while (cur >= p) {
                    sb.append(s.charAt(cur--));
                }
            }
            if (s.charAt(i) == ' ') {
                int cur = i - 1;
                while (cur >= p) {
                    sb.append(s.charAt(cur--));
                }
                p = i;
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        LeetCode557 solution = new LeetCode557();
        solution.reverseWords("Let's take LeetCode contest");
    }
}
