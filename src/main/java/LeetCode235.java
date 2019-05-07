import util.TreeNode;

/**
 * Function:
 *
 * @author: Huangqing
 * @Date: 2019/5/7
 * @since: JDK 1.8
 */
public class LeetCode235 {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }
        if (p == null && q != null) {
            return q;
        }
        if (p != null && q == null) {
            return p;
        }
        if (p.val < root.val && q.val < root.val) {
            lowestCommonAncestor(root.left, p, q);
        }
        if (p.val > root.val && q.val > root.val) {
            lowestCommonAncestor(root.right, p, q);
        }

        return root;
    }
}
