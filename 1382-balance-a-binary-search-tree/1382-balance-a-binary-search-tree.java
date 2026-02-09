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
class Solution {//follow up question of leetcode 108
     public TreeNode helper(int lo,int hi,ArrayList<Integer> arr){
        if(lo>hi)return null;
        int m = lo+(hi-lo)/2;
        TreeNode root=new TreeNode(arr.get(m));
        root.left=helper(lo,m-1,arr);
        root.right=helper(m+1,hi,arr);
        return root;
    }
    public TreeNode sortedArrayToBST(ArrayList<Integer> nums) {
       return helper(0,nums.size()-1,nums);
    }

    public void inorder(TreeNode root,ArrayList<Integer> ans){
        if(root==null)return;
        inorder(root.left,ans);
        ans.add(root.val);
        inorder(root.right,ans);
    }
    public TreeNode balanceBST(TreeNode root) {
        ArrayList<Integer> ans=new ArrayList<>();
        inorder(root,ans);
        return sortedArrayToBST(ans);

    }
    
}