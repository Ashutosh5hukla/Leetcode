class Solution {
    public int maxDepth(String s) {
        int m=0;
        Stack<Character> st=new Stack<>();
        for(Character ch : s.toCharArray()){
            m=Math.max(st.size(),m);
            if(ch=='('){
                st.push('(');

            }else if(ch==')'){
                st.pop();
            }
        }
        return m;
    }
}