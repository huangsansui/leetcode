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
        if (head == null) {
            return true;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        if (fast != null) {
            slow = slow.next;
        }
        ListNode dummyHead = null;
        while (slow != null) {
            ListNode next = slow.next;
            slow.next = dummyHead;
            dummyHead = slow;
            slow = next;
        }
        fast = head;
        while (dummyHead != null) {
            if (dummyHead.val != fast.val) {
                return false;
            }
            dummyHead = dummyHead.next;
            fast = fast.next;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums = {1,2};
        System.out.println((new LeetCode234()).isPalindrome(new ListNode(nums)));
    }
}
