/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public final TreeNode getTargetCopy(final TreeNode og, final TreeNode cl, final TreeNode t) {
        return hp(cl,t);
    }
    TreeNode hp(TreeNode c, TreeNode t) {
        if (c == null) return null;
        if (c.val == t.val) return c;
        TreeNode left = hp(c.left, t);
        if (left != null) return left;
        return hp(c.right, t);
    }
}