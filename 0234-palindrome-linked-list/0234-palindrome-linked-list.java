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
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> st=new Stack<>();
        ListNode f=head;
        ListNode s=head;
        while(f!=null && f.next!=null){
            st.push(s.val);
            s=s.next;
            f=f.next.next;
        }
        if(f!=null)s=s.next;
        while(!st.isEmpty()){
            if(st.pop()!=s.val)return false;
            s=s.next;
        }
        return true;
    }
}