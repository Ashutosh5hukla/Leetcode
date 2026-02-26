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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null)return head;
        ListNode s=head;
        ListNode f=head;
        int l=len(head);
        k=k%l;
        while(k!=0){
            k--;
            f=f.next;
        }
        while(f.next!=null){
            s=s.next;
            f=f.next;
        }
        f.next=head;
        head=s.next;
        s.next=null;
        return head;
        // if(head==null || head.next==null)return head;
        // ListNode s=head;
        // ListNode f=head;
        // int l=len(head);
        // k=k%l;
        // while(k!=0){
        //     f=f.next;
        //     k--;
        // }
        // while(f.next!=null){
        //     s=s.next;
        //     f=f.next;
        // }
        // f.next=head;
        // head=s.next;
        // s.next=null;
        // return head;
    }
    // public int len(ListNode head){
    //     int c=0;
    //     ListNode t=head;
    //     while(t!=null){
    //         c++;
    //         t=t.next;
    //     }
    //     return c;
    // }
    public int len(ListNode h){
        int l=0;
        while(h!=null){
            l++;
            h=h.next;
        }
        return l;
    }
}