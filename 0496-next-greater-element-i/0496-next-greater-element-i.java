class Solution {
    public int[] nextGreaterElement(int[] arr, int[] brr){
        Stack<Integer> st=new Stack<>();
        int freq[]=new int[10001];
        for(int i=brr.length-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=brr[i])st.pop();
            if(st.isEmpty())freq[brr[i]]=-1;
            else freq[brr[i]]=st.peek();
            st.push(brr[i]);
        }
        int ans[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            ans[i]=freq[arr[i]];
        }
        return ans;
    }
}