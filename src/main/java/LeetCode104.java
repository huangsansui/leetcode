import util.TreeNode;

/**
 * Function:
 *
 * @author: Huangqing
 * @Date: 2019/1/12
 * @since: JDK 1.8
 */
public class LeetCode104 {

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(maxDepth(root.left) + 1, maxDepth(root.right) + 1);
    }
}
