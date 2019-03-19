import util.ListNode;

/**
 * Function:
 *
 * @author: Huangqing
 * @Date: 2019/3/19
 * @since: JDK 1.8
 */
public class LeetCode876 {

    public ListNode middleNode(ListNode head) {
        int size = 0;
        ListNode tmp = head;
        while (tmp.next != null) {
            size++;
            tmp = tmp.next;
        }
        int index = size / 2;
        for (int i = 0; i < index; i++) {
            head = head.next;
        }
        return head;
    }
}
