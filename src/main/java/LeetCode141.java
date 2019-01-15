import util.ListNode;

import java.util.HashSet;

/**
 * Function:
 *
 * @author Huangqing
 * @date 2019/1/15 9:33
 * @since JKD 1.8
 */
public class LeetCode141 {

    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        HashSet<ListNode> set = new HashSet<>();
        while (true) {
            if (head.next == null) {
                break;
            }
            int size = set.size();
            set.add(head);
            if (set.size() != size + 1) {
                return true;
            }
            head = head.next;
        }
        return false;
    }
}
