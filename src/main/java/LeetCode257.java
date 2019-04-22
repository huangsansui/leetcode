import util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Function:
 *
 * @author: Huangqing
 * @Date: 2019/4/23
 * @since: JDK 1.8
 */
public class LeetCode257 {

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        if (root.left == null && root.right == null) {
            list.add(String.valueOf(root.val));
            return list;
        }
        List<String> left = binaryTreePaths(root.left);
        for (int i = 0; i < left.size(); i++) {
            list.add(String.valueOf(root.val) + "->" + left.get(i));
        }
        List<String> right = binaryTreePaths(root.right);
        for (int j = 0; j < right.size(); j++) {
            list.add(String.valueOf(root.val) + "->" + right.get(j));
        }
        return list;
    }
}
