import util.TreeNode;

/**
 * Function:
 *
 * @author: Huangqing
 * @Date: 2019/4/23
 * @since: JDK 1.8
 */
public class LeetCode111 {

    /**
     * NOTE：一定要递归到叶子节点
     * @param root
     * @return
     */
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        } else if (root.left == null) {
            return minDepth(root.right) + 1;
        } else if (root.right == null) {
            return minDepth(root.left) + 1;
        } else {
            return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
        }
    }
}
