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
        helper(root);
        return root;
    }
    void helper(TreeNode nd){
        Queue<TreeNode> q=new ArrayDeque<>();
        q.add(nd);
        int lvl=1;
        while(!q.isEmpty()){
            int sz=q.size();
            ArrayList<TreeNode> list=new ArrayList<>();
            for(int i=0;i<sz;i++){
                TreeNode node=q.remove();
                if(node.left!=null){
                    q.add(node.left);
                    if(lvl%2!=0)list.add(node.left);
                }
                if(node.right!=null){
                    q.add(node.right);
                    if(lvl%2!=0)list.add(node.right);
                }
            }
            int i=0,j=list.size()-1;
            while(i<j){
                int t=list.get(i).val;
                list.get(i).val=list.get(j).val;
                list.get(j).val=t;
                i++;
                j--;
            }
            lvl++;
        }
    }
}