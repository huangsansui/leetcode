import util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Function:
 *
 * @author: Huangqing
 * @Date: 2019/1/13
 * @since: JDK 1.8
 */
public class LeetCode107 {

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        // 使用队列先进先出的特性；
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (q.size() > 0) {
            List<Integer> list = new ArrayList<>();
            int size = q.size();
            for (int i=0;i<size;i++) {
                // 取出队列第一个元素
                TreeNode node = q.poll();
                list.add(node.val);
                if (node.left != null) {
                    q.add(node.left);
                }
                if (node.right != null) {
                    q.add(node.right);
                }
            }
            // 把list加入到result下标0位置，其他元素后移
            result.add(0, list);
        }
        return result;
    }
}
