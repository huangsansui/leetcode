import java.util.Arrays;

/**
 * TODO
 *
 * @author huangqing
 * @date 2022/4/17 11:02
 */
public class LeetCode6071 {

    public int minimumRounds(int[] tasks) {
        Arrays.sort(tasks);
        int l = 0;
        int r = 0;
        int count = 0;
        while (r < tasks.length) {
            if (tasks[l] == tasks[r]) {
                r++;
                if (r == tasks.length) {
                    int len = r - l;
                    if (len == 1) {
                        return -1;
                    }
                    count += fun(len, 0);
                    break;
                }
            } else {
                int len = r - l;
                if (len == 1) {
                    return -1;
                }
                count += fun(len, 0);
                l = r;
            }
        }
        return count;
    }

    private int fun(int len, int ans) {
        if (len == 0) {
            return ans;
        }
        if (len % 3 == 0) {
            return fun(len - 3, ++ans);
        }
        if (len % 2 == 0) {
            return fun(len - 2, ++ans);
        }
        return Math.min(fun(len - 3, ans + 1), fun(len - 2, ans + 1));
    }

    public static void main(String[] args) {
        LeetCode6071 solution = new LeetCode6071();
        int i = solution.minimumRounds(new int[]{2,2,3});
        System.out.println(i);
    }
}
