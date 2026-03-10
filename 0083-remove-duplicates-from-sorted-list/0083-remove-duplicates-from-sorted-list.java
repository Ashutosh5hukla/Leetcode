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
class Solution {//
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null)return head;
        ListNode s=head;
        ListNode f=head.next;
        while(f!=null){
           while(f!=null && s.val==f.val)f=f.next;
           s.next=f;
           s=s.next;
        }
        return head;
    }
}