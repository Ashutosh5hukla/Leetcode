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
    static boolean f;
    public boolean isBalanced(TreeNode root) {
        f=true;
        md(root);
        return f;
    }
    public int md(TreeNode root){
        if(root==null)return 0;
        int l=md(root.left);
        int r=md(root.right);
        if(Math.abs(l-r)>1)f=false;
        return 1+Math.max(l,r);
    }
}