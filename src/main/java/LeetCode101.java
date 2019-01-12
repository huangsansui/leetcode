import util.TreeNode;

/**
 * Function:
 *
 * @author: Huangqing
 * @Date: 2019/1/12
 * @since: JDK 1.8
 */
public class LeetCode101 {

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return compareLeftAndRight(root.left, root.right);
    }

    public boolean compareLeftAndRight(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }
        if (left.val == right.val)
            return compareLeftAndRight(left.left, right.right) &&
                    compareLeftAndRight(left.right, right.left);
        return false;
    }
}
