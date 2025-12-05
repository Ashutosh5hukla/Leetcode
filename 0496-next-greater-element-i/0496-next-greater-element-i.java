class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int freq[]=new int[10001];
        Stack<Integer> st=new Stack<>();
        Arrays.fill(freq,-1);
        int j=nums2.length-1;
        while(j>=0){
            while(!st.isEmpty() && st.peek() <=nums2[j])st.pop();
            if(!st.isEmpty())freq[nums2[j]]=st.peek();
            st.push(nums2[j]);
            j--;
        }
        int ans[]=new int[nums1.length];
        for(int i=0;i<ans.length;i++){
            ans[i]=freq[nums1[i]];
        }
        return ans;
    }
}