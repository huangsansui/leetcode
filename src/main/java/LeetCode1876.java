public class LeetCode1876 {

    public int countGoodSubstrings(String s) {
        int res = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.charAt(i) != s.charAt(i + 1)
                    && s.charAt(i) != s.charAt(i + 2)
                    && s.charAt(i + 1) != s.charAt(i + 2)) {
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        LeetCode1876 solution = new LeetCode1876();
        solution.countGoodSubstrings("xyzzaz");
    }
}
