import util.ListNode;

/**
 * Function:
 *
 * @author: Huangqing
 * @Date: 2019/1/12
 * @since: JDK 1.8
 */
public class LeetCode83 {

    public ListNode deleteDuplicates(ListNode head) {
        ListNode headNode = head;
        while (head != null && head.next != null) {
            if (head.next.val == head.val) {
                head.next = head.next.next;
                continue;
            }
            head = head.next;
        }
        return headNode;
    }

    public static void main(String[] args) {
        LeetCode83 code83 = new LeetCode83();
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(2);
        System.out.println(code83.deleteDuplicates(node));
    }
}
