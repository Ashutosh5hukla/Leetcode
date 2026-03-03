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
    public ListNode sortList(ListNode head) {
        if(head==null ||head.next==null)return head;
        ListNode s=head;
        ListNode f=head;
        while(f.next!=null && f.next.next!=null){
            s=s.next;
            f=f.next.next;
        }
        ListNode first=head;
        ListNode second=s.next;
        s.next=null;
        ListNode firstHalf=sortList(first);
        ListNode secondHalf=sortList(second);
        ListNode ans=merge(firstHalf,secondHalf);
        return ans;
    }
     ListNode merge(ListNode l1 ,ListNode l2){
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
        ListNode temp1=l1;
        ListNode temp2=l2;
        while(temp1!=null && temp2!=null){
            if(temp1.val<temp2.val){
                temp.next=temp1;
                temp1=temp1.next;
            }
            else{
                temp.next=temp2;
                temp2=temp2.next; 
            }
        temp=temp.next;
        }
        if(temp1!=null)temp.next=temp1;
        else temp.next=temp2;
        dummy=dummy.next;
        return dummy;
    }
}