import util.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Function:
 *
 * @author Huangqing
 * @date 2019/1/29 10:47
 * @since JKD 1.8
 */
public class LeetCode429 {


    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            List<Integer> list = new LinkedList<>();
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                Node cur = queue.poll();
                list.add(cur.val);
                for (Node n : cur.children) {
                    queue.offer(n);
                }
            }
            result.add(list);
        }
        return result;
    }
}
