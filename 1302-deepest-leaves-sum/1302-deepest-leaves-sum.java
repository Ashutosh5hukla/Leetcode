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
    public int deepestLeavesSum(TreeNode root) {
        int sum[]=new int[1];
        dfs(root,0,new int[]{0},sum);
        return sum[0];
    }
    void dfs(TreeNode node,int h,int[]maxh,int[] sum){
        if(node==null)return;
        if(h>maxh[0]){
            maxh[0]=h;
            sum[0]=node.val;
        }else if(h==maxh[0])sum[0]+=node.val;
        dfs(node.left,h+1,maxh,sum);
        dfs(node.right,h+1,maxh,sum);

    }
}
