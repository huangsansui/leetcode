import util.TreeNode;

/**
 * link #{https://leetcode-cn.com/problems/convert-bst-to-greater-tree/comments/}
 * Created on 2019/7/16
 *
 * @author qing.huang
 */
public class LeetCode538 {

    private int sum = 0;

    public TreeNode convertBST(TreeNode root) {
        handle(root);
        return root;
    }

    private void handle(TreeNode root) {
        if (root == null) {
            return;
        }
        handle(root.right);
        root.val = sum + root.val;
        sum = root.val;
        handle(root.left);
    }

    public static void main(String[] args) {
        LeetCode538 code = new LeetCode538();
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(2);
        root.right = new TreeNode(13);
        code.convertBST(root);
    }
}
