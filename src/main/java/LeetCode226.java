import util.TreeNode;

/**
 * Function:
 *
 * @author: Huangqing
 * @Date: 2019/4/22
 * @since: JDK 1.8
 */
public class LeetCode226 {

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        invertTree(root.left);
        invertTree(root.right);

        return root;
    }

}
