import util.ListNode;

/**
 * Function:
 *
 * @author Huangqing
 * @date 2019/1/17 11:27
 * @since JKD 1.8
 */
public class LeetCode203 {

    public ListNode removeElements(ListNode head, int val) {
        ListNode newHead = new ListNode(0);
        newHead.next = head;
        ListNode cur = head;
        ListNode prev = newHead;
        while (cur != null) {
            if (cur.val == val) {
                prev.next = cur.next;
            } else {
                prev = prev.next;
            }
            cur = cur.next;
        }
        return newHead.next;
    }
}
