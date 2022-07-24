import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class LeetCode39 {

    private List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        dfs(candidates, 0, new Stack<>(), target);
        return res;
    }

    private void dfs(int[] candidates, int index, Stack<Integer> stack, int target) {
        if (target == 0) {
            res.add(new ArrayList<>(stack));
            return;
        }

        for (int i = index; i < candidates.length; i++) {
            if (candidates[i] <= target) {
                stack.push(candidates[i]);
                dfs(candidates, i, stack, target - candidates[i]);
                stack.pop();
            } else {
                break;
            }
        }

    }
}
