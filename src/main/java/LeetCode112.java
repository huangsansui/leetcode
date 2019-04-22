import util.TreeNode;

/**
 * Function:
 *
 * @author: Huangqing
 * @Date: 2019/4/22
 * @since: JDK 1.8
 */
public class LeetCode112 {

    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null ) {
            return root.val == sum;
        }
        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }
}
