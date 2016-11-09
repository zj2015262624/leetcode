package leetcodeAlgorithms;

/**
 * Created by Administrator on 2016/11/9 0009.
 */
public class AddTwoNumbers {
    private class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    /**
     * You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
     * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
     * Output: 7 -> 0 -> 8
     *
     * @param l1
     * @param l2
     * @return result
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode temp = result;
        ListNode zeroNode = new ListNode(0);
        int sum = 0;
        while (true) {
            sum = l1.val + l2.val + temp.val;
            temp.val = sum % 10;
            if (l1.next == null && l2.next == null) {
                break;
            } else if (l1.next == null) {
                l1 = zeroNode;
                l2 = l2.next;
            } else if (l2.next == null) {
                l1 = l1.next;
                l2 = zeroNode;
            } else {
                l1 = l1.next;
                l2 = l2.next;
            }
            temp.next = new ListNode(sum / 10);
            temp = temp.next;
        }
        if (sum >= 10) {
            temp.next = new ListNode(1);
        }
        return result;
    }
}
