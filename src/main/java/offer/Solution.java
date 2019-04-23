package offer;

import util.ListNode;
import util.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Function:
 *
 * @author: Huangqing
 * @Date: 2019/4/24
 * @since: JDK 1.8
 */
public class Solution {

    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if (pRoot == null) {
            return res;
        }
        Stack<TreeNode> p = new Stack<>();
        Stack<TreeNode> q = new Stack<>();
        p.push(pRoot);
        while (!p.isEmpty() || !q.isEmpty()) {

            if (!p.isEmpty()) {
                ArrayList<Integer> list = new ArrayList<>();
                while (!p.isEmpty()) {
                    TreeNode node = p.pop();
                    list.add(node.val);
                    TreeNode left = node.left;
                    TreeNode right = node.right;
                    if (left != null) {
                        q.push(left);
                    }
                    if (right != null) {
                        q.push(right);
                    }
                }
                res.add(list);

            } else {
                ArrayList<Integer> list = new ArrayList<>();
                while (!q.isEmpty()) {
                    TreeNode node = q.pop();
                    list.add(node.val);
                    TreeNode left = node.left;
                    TreeNode right = node.right;
                    if (right != null) {
                        p.push(right);
                    }
                    if (left != null) {
                        p.push(left);
                    }
                }
                res.add(list);
            }
        }
        return res;
    }
}
