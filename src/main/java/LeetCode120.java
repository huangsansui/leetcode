import java.util.List;

/**
 * TODO
 *
 * @author huangqing
 * @date 2022/4/28 21:39
 */
public class LeetCode120 {

    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[][] dp = new int[n + 1][n + 1];
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                dp[i][j] = Math.min(dp[i + 1][j], dp[i + 1][j + 1]) + triangle.get(i).get(j);
            }
        }
        return dp[0][0];
    }

    public int minimumTotal1(List<List<Integer>> triangle) {
        int[][] dp = new int[triangle.size()][triangle.size()];
        return dfs(triangle, 0, 0, dp);
    }

    private int dfs(List<List<Integer>> triangle, int i, int j, int[][] dp) {
        if (i == triangle.size()) {
            return 0;
        }
        if (dp[i][j] != 0) {
            return dp[i][j];
        }
        dp[i][j] = Math.min(dfs(triangle, i + 1, j, dp), dfs(triangle, i + 1, j + 1, dp)) + triangle.get(i).get(j);
        return dp[i][j];
    }
}
