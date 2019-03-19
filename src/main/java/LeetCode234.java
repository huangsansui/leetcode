import util.ListNode;

/**
 * Function:
 *
 * @author: Huangqing
 * @Date: 2019/3/20
 * @since: JDK 1.8
 */
public class LeetCode234 {

    public boolean isPalindrome(ListNode head) {
        ListNode dummyHead = null;
        ListNode node = head;
        while (node != null) {
            ListNode next = node.next;
            node.next = dummyHead;
            dummyHead = node;
            node = next;
        }
        System.out.println(dummyHead);
        System.out.println(head);
        return true;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        (new LeetCode234()).isPalindrome(new ListNode(nums));
    }
}
