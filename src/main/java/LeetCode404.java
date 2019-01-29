import util.TreeNode;

/**
 * Function:
 *
 * @author Huangqing
 * @date 2019/1/29 10:08
 * @since JKD 1.8
 */
public class LeetCode404 {

    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int sum = 0;
        if (root.left != null) {
            if (root.left.left == null && root.left.right == null) {
                sum += root.left.val;
            } else {
                sum += sumOfLeftLeaves(root.left);
            }
        }
        sum += sumOfLeftLeaves(root.right);
        return sum;
    }
}
