class Solution {
    public int minLength(String s) {
        Stack<Character> st=new Stack<>();
        for(Character ch : s.toCharArray()){
            if(!st.isEmpty()){
                if(ch=='B' && st.peek()=='A' || ch=='D' && st.peek()=='C')st.pop();
                else st.push(ch);
            }else{
                st.push(ch);
            }
        }
        return st.size();
    }
}