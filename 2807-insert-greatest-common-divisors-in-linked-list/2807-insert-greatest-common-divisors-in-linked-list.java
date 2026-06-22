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
    static int gcd(int a,int b){
        while(b!=0){
            int t=b;
            b=a%b;
            a=t;
        }
        return a;
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head==null ||head.next==null)return head;
        ListNode t1=head;
        ListNode t2=head.next;
        while(t2!=null){
            int x=t1.val;
            int y=t2.val;
            int z=gcd(x,y);
            ListNode temp=new ListNode(z);
            t1.next=temp;
            temp.next=t2;
            t1=t2;
            t2=t2.next;
        }
        return head;
    }
}