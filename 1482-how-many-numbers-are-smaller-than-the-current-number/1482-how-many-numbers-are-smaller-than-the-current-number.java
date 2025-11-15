class Solution {
    public int[] smallerNumbersThanCurrent(int[] arr) {
        int freq[]=new int[101];
        for(int i=0;i<arr.length;i++)freq[arr[i]]++;
        int pre[]=new int[freq.length];
        pre[0]=freq[0];
        for(int i=1;i<pre.length;i++){
            pre[i]=freq[i]+pre[i-1];
        }
        int ans[]=new int[arr.length];
        for(int i=0;i<ans.length;i++){
           if(arr[i]!=0)ans[i]=pre[arr[i]-1];
           else ans[i]=0;
        }
        return ans;
    }
}