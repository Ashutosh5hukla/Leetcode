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
    public ListNode mergeNodes(ListNode head) {
        ListNode ans=new ListNode(-1);
        ListNode t1=ans;
        ListNode t2=head.next;
        int s=0;
        while(t2!=null){
            while(t2.val!=0){
                s+=t2.val;
                t2=t2.next;
            }
            t1.next=new ListNode(s);
            s=0;
            t1=t1.next;
            t2=t2.next;
        }
        return ans.next;
    }
}