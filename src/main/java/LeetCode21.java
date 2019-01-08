import util.ListNode;

/**
 * Function:
 *
 * @author Huangqing
 * @date 2019/1/8 16:55
 * @since JKD 1.8
 */
public class LeetCode21 {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }

    public ListNode mergeTwoLists1(ListNode l1, ListNode l2) {
        ListNode returnNode = new ListNode(0);
        ListNode headNode = returnNode;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                returnNode.next = l1;
                l1 = l1.next;
            } else {
                returnNode.next = l2;
                l2 = l2.next;
            }
            returnNode = returnNode.next;
        }
        if (l1 == null) {
            returnNode.next = l2;
        } else if (l2 != null) {
            returnNode.next = l1;
        }
        return headNode.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);
        LeetCode21 code = new LeetCode21();
        ListNode l = code.mergeTwoLists1(l1, l2);
    }
}
