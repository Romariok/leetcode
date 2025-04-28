/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
   public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       ListNode dummy = new ListNode(0);
       ListNode tmp = dummy;
       int carry = 0;


       while (l1!=null || l2 !=null){
           int first = 0, second = 0;
           if (l1 != null) first = l1.val;
           if (l2 != null) second = l2.val;

           int sum = first + second + carry;
           tmp.next = new ListNode((int) sum%10);
           carry = sum/10;
           tmp=tmp.next;
           if (l1 != null) l1 = l1.next;
           if (l2 != null) l2 = l2.next;
       }
       if (carry!=0){
           tmp.next = new ListNode(carry);
       }

       return dummy.next;
   }
}