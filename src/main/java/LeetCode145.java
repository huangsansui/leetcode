import util.TreeNode;

import java.util.List;
import java.util.Stack;

/**
 * Function:
 *
 * @author: Huangqing
 * @Date: 2019/4/12
 * @since: JDK 1.8
 */
public class LeetCode145 {

    Stack<Integer> stack = new Stack<>();

    public List<Integer> postorderTraversal(TreeNode root) {
        postorder(root);
        return stack;
    }

    private void postorder(TreeNode root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        stack.add(root.val);
    }
}
