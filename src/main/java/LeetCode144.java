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
public class LeetCode144 {

    Stack<TreeNode> stack = new Stack<>();
    Stack<Integer> res = new Stack<>();

    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null) {
            return res;
        }
        preorder(root);
        return res;
    }

    private void preorder(TreeNode root) {
        if (root == null) {
            return;
        }
        stack.add(root);
        res.add(root.val);
        preorder(root.left);
        preorder(root.right);
    }
}
