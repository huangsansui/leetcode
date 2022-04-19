import util.ListNode;

/**
 * TODO
 *
 * @author huangqing
 * @date 2022/4/20 00:18
 */
public class LeetCode19 {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode pre = new ListNode(-1);
        pre.next = head;
        ListNode slow = pre;
        ListNode fast = pre;
        while (n > 0) {
            fast = fast.next;
            n--;
        }
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        if (slow.next.next != null) {
            slow.next = slow.next.next;
        }
        return pre.next;
    }
}
