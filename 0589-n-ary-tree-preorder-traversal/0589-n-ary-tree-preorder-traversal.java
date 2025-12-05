class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> output = new ArrayList<>();
        if (root == null) return output;

        Stack<Node> st = new Stack<>();
        st.push(root);
        while (!st.isEmpty()) {
           Node curr=st.pop();
           output.add(curr.val);
           for(int i=curr.children.size()-1;i>=0;i--){
            st.push(curr.children.get(i));
           }
        }
        return output;
    }
}