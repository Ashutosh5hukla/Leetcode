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
        ListNode t1=l1;
        ListNode t2=l2;
        ListNode ans=new ListNode(-1);
        ListNode t3=ans;
        boolean carry=false;
        while(t1!=null && t2!=null){
            int sum=t1.val+t2.val;
            if(carry){
                sum+=1;
                carry=false;
            }
            ListNode temp=new ListNode(sum%10);
            t3.next=temp;
            if(sum>9)carry=true;
            t1=t1.next;
            t2=t2.next;
            t3=t3.next;
        }
        while(t1!=null){
            int sum=t1.val;
            if(carry){
                sum+=1;
                carry=false;
            }
            ListNode temp=new ListNode(sum%10);
            t3.next=temp;
            if(sum>9)carry=true;
            t1=t1.next;
            t3=t3.next;
        }
         while(t2!=null){
            int sum=t2.val;
            if(carry){
                sum+=1;
                carry=false;
            }
            ListNode temp=new ListNode(sum%10);
            t3.next=temp;
            if(sum>9)carry=true;
            t2=t2.next;
            t3=t3.next;
        }
        if(carry)t3.next = new ListNode(1);
        ans=ans.next;
        return ans;
    }
}