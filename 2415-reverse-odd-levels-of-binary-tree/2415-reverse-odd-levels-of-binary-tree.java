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
    public TreeNode reverseOddLevels(TreeNode root) {
        helper(root.left,root.right,1);
        return root;
    }
    void helper(TreeNode left,TreeNode right,int lvl){
        if(left==null || right==null)return;
        if(lvl%2==1){
            int t=left.val;
            left.val=right.val;
            right.val=t;
        }
         helper(left.left,right.right,lvl+1);
         helper(left.right,right.left,lvl+1);
    }
}