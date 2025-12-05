/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
*/

class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> ans=new ArrayList<>();
        Stack<Node> st=new Stack<>();
        if(root==null)return ans;
        st.push(root);
        while(!st.isEmpty()){
            Node curr=st.pop();
            ans.add(curr.val);
            for(int i=0;i<curr.children.size();i++){
                st.push(curr.children.get(i));
            }
        }
        Collections.reverse(ans);
        return ans;
    }
}