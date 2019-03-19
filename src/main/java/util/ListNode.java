package util;

/**
 * Function:
 *
 * @author Huangqing
 * @date 2019/1/8 16:56
 * @since JKD 1.8
 */
public class ListNode {

    public int val;

    public ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int[] arr) {
        this.val = arr[0];
        ListNode curr = this;
        for (int i = 1; i < arr.length; i++) {
            curr.next = new ListNode(arr[i]);
            curr = curr.next;
        }
    }

    @Override
    public String toString() {
        StringBuffer result = new StringBuffer();
        ListNode cur = this;
        while (cur != null) {
            result.append(cur.val + "->");
            cur = cur.next;
        }
        result.append("NULL");
        return result.toString();
    }
}
