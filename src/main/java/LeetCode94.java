import util.TreeNode;

import java.util.List;
import java.util.Stack;

/**
 * Function:
 *
 * @author: Huangqing
 * @Date: 2019/4/11
 * @since: JDK 1.8
 */
public class LeetCode94 {

    Stack<Integer> res = new Stack<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        inorder(root);
        return res;
    }

    private void inorder(TreeNode root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        res.add(root.val);
        inorder(root.right);
    }
}
