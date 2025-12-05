class Solution {
    public int calPoints(String[] op) {
        Stack<Integer> st = new Stack<>();

        for(String s : op){
            if(s.equals("C")){
                st.pop();
            } 
            else if(s.equals("D")){
                st.push(st.peek() * 2);
            } 
            else if(s.equals("+")){
                int last = st.pop();
                int newScore = last + st.peek();
                st.push(last);
                st.push(newScore);
            } 
            else {
                st.push(Integer.parseInt(s));
            }
        }

        int sum = 0;
        while(!st.isEmpty()){
            sum += st.pop();
        }
        return sum;
    }
}
