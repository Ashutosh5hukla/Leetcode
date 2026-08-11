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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) {
            return head;
        }

        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode t=dummy;
        for(int i=1;i<=left-1;i++)t=t.next;
        //rev
        
        ListNode curr=t.next;
        ListNode tail=curr;
        ListNode prev=null;
        ListNode nx=null;
        for(int i=1;i<=right-left+1;i++){
           nx=curr.next;
           curr.next=prev;
           prev=curr;
           curr=nx;
        }
        t.next=prev;
        tail.next=curr;
        return dummy.next;        
    }
}