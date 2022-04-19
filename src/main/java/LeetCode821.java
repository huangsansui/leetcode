import java.util.Arrays;

public class LeetCode821 {

    public int[] shortestToChar(String s, char c) {
        int[] res = new int[s.length()];
        int l = 0, r;
        int i = 0;
        while (i < res.length) {
            if (s.charAt(l) != c) {
                l++;
                continue;
            }
            r = l + 1;
            while (r < res.length) {
                if (s.charAt(r) != c) {
                    r++;
                    continue;
                } else {
                    break;
                }
            }
            // 只有一个 c
            if (r == res.length) {
                res[i] = Math.abs(i - l);
                i++;
            } else {
                res[i] = Math.min(Math.abs(i - l), Math.abs(i - r));
                if (i == r) {
                    l = r;
                }
                i++;
            }
        }
        return res;
    }

    public int[] shortestToChar1(String s, char c) {
        int n = s.length();
        int[] res = new int[n];
        Arrays.fill(res, n + 1);
        for (int i = 0, j = -1; i < n; i++) {
            if (s.charAt(i) == c) {
                j = i;
            }
            if (j != -1) {
                res[i] = i - j;
            }
        }
        for (int i = n - 1, j = -1; i >= 0; i--) {
            if (s.charAt(i) == c) {
                j = i;
            }
            if (j != -1) {
                res[i] = Math.min(res[i], j - i);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        LeetCode821 solution = new LeetCode821();
        solution.shortestToChar("loveleetcode", 'e');
    }
}
