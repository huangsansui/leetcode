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
        // 找到中点
        ListNode head1 = head;
        ListNode head2 = head;
        while (head2.next != null && head2.next.next != null) {
            head1 = head1.next;
            head2 = head2.next.next;
        }
        // head  1 -> 2 -> 3 -> 4 -> 5 -
        // head1 3 -> 4 -> 5
        // head2
        return true;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        (new LeetCode234()).isPalindrome(new ListNode(nums));
    }
}
