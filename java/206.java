
public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public ListNode reverseListRec(ListNode head, ListNode last, Boolean first) {
        if (head == null) {
            return last;
        }
        ListNode newNode = head.next;
        if (first) {
            head.next = new ListNode(last.val);
        } else {
            head.next = last;
        }

        return reverseListRec(newNode, head, false);
    }

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        return reverseListRec(head.next, head, true);
    }

}