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
    public boolean isSymmetric(TreeNode root) {
        if(root==null)return true;
        else return issymatricsubtree(root.left,root.right);
    }

    public boolean issymatricsubtree(TreeNode left,TreeNode right){
        if(left==null && right==null)return true;
        if(left==null || right==null)return false;
        int x=left.val;
        int y=right.val;
        if(x==y){
            return issymatricsubtree(left.left,right.right) && issymatricsubtree(left.right,right.left);
        }else{
            return false;
        }
    }
}