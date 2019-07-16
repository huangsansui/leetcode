import util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Function:
 *
 * @author: Huangqing
 * @Date: 2019/5/7
 * @since: JDK 1.8
 */
public class LeetCode98 {

    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        List<Integer> list = new ArrayList<>();
        orderTree(root, list);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) <= list.get(i - 1)) {
                return false;
            }
        }
        return true;
    }

    private void orderTree(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        orderTree(root.left, list);
        list.add(root.val);
        orderTree(root.right, list);
    }
}
