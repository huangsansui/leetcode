import util.ListNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Function:
 *
 * @author: Huangqing
 * @Date: 2019/4/10
 * @since: JDK 1.8
 */
public class LeetCode445 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> q1 = new Stack<>();
        Stack<Integer> q2 = new Stack<>();
        Stack<Integer> ret = new Stack<>();

        while (l1 != null) {
            q1.add(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            q2.add(l2.val);
            l2 = l2.next;
        }
        int count = 0;
        while (!q1.isEmpty() && !q2.isEmpty()) {
            int nums1 = q1.pop();
            int nums2 = q2.pop();
            int temp = nums1 + nums2 + count;
            if (temp >= 10) {
                count = 1;
                temp %= 10;
            } else {
                count = 0;
            }
            ret.add(temp);
        }
        while (!q1.isEmpty()) {
            int num = q1.pop();
            if (num + count >= 10) {
                count = 1;
                num %= 10;
                ret.add(num);
            } else {
                ret.add(num + count);
            }
        }
        while (!q2.isEmpty()) {
            int num = q2.pop();
            if (num + count >= 10) {
                count = 1;
                num %= 10;
                ret.add(num);
            } else {
                ret.add(num + count);
            }
        }
        ListNode res = new ListNode(0);
        ListNode pre = res;
        while (!ret.isEmpty()) {
            res.next = new ListNode(ret.pop());
            res = res.next;
        }
        return pre.next;
    }

    public static void main(String[] args) {
        LeetCode445 code = new LeetCode445();
        ListNode l1 = new ListNode(7);
        ListNode l11 = new ListNode(2);
        ListNode l111 = new ListNode(4);
        ListNode l1111 = new ListNode(3);
        l1.next = l11;
        l11.next = l111;
        l111.next = l1111;
        ListNode l2 = new ListNode(5);
        ListNode l22 = new ListNode(6);
        ListNode l222 = new ListNode(4);
        l2.next = l22;
        l22.next = l222;
        ListNode result = code.addTwoNumbers(l1, l2);
    }
}
