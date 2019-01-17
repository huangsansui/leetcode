import util.ListNode;

import java.util.List;

/**
 * Function:
 *
 * @author Huangqing
 * @date 2019/1/16 11:35
 * @since JKD 1.8
 */
public class LeetCode206 {

    public ListNode reverseList(ListNode head) {
        ListNode newHead = null;
        while (head != null) {
            ListNode temp = head.next;
            head.next = newHead;
            newHead = head;
            head = temp;
        }
        return newHead;
    }

    public ListNode reverseList1(ListNode head) {
        return reverse(head, null);
    }

    private ListNode reverse(ListNode head, ListNode newHead) {
        if (head == null) {
            return newHead;
        }
        ListNode temp = head.next;
        head.next = newHead;
        return reverse(temp, head);
    }


    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        LeetCode206 code = new LeetCode206();
        ListNode result = code.reverseList1(node);
    }
}
