import util.ListNode;

/**
 * Function:
 *
 * @author: Huangqing
 * @Date: 2019/4/9
 * @since: JDK 1.8
 */
public class LeetCode92 {

    public ListNode reverseBetween(ListNode head, int m, int n) {
        int i = 1;
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode next = head.next;
            if (i >= m && i <= n) {
                cur.next = pre;
                pre = cur;
                cur = next;
            } else {
                pre = cur;
                cur = next;
            }
            i++;
        }
        return pre;
    }
}
