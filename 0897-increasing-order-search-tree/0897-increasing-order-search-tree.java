/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode increasingBST(TreeNode root) {
        Stack<TreeNode> st=new Stack<>();
        List<Integer> ans=new ArrayList<>();
        TreeNode curr=root;
        while(!st.isEmpty() || curr!=null){
            while(curr!=null){
                st.push(curr);
                curr=curr.left;
            }
            ans.add(st.peek().val);
            curr=st.pop().right;
        }
        TreeNode r=new TreeNode(-1);
        curr=r;
        for(int i=0;i<ans.size();i++){
            curr.right=new TreeNode(ans.get(i));
            curr=curr.right;
        }
        return r.right;
    }
}