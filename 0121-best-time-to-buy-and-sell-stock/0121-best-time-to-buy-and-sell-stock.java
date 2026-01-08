class Solution {
    public int maxProfit(int[] arr) {
        Stack<Integer> st=new Stack<>();
        int p=0;
        for(int i=arr.length-1;i>=0;i--){
            if(st.isEmpty())st.push(arr[i]);
            else if(st.peek()>arr[i]){
                p=Math.max(p,st.peek()-arr[i]);
            }else{
                st.pop();
                st.push(arr[i]);
            }
        }
        return p;
    }
}