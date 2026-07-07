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
    int ans=0;
    class Pair{
        int cnt,sum;
        Pair(int sum,int cnt){
            this.cnt=cnt;
            this.sum=sum;
        }
    }
    public int averageOfSubtree(TreeNode root) {
        helper(root);
        return ans;
    }
    Pair helper(TreeNode node){
        if(node==null){
            return new Pair(0,0);
        }
        Pair l=helper(node.left);
        Pair r=helper(node.right);
        int sum=l.sum+r.sum+node.val;
        int cnt=l.cnt+r.cnt+1;
        if(sum/cnt==node.val)ans++;
        return new Pair(sum,cnt);
    }


}