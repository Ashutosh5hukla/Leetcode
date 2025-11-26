class Solution {
    public int findPoisonedDuration(int[] arr, int d) {
        if(arr.length==1)return d;
        int ans=0;
        for(int i=0;i<arr.length-1;i++){
            ans+=Math.min(d,arr[i+1]-arr[i]);
        }
        ans+=d;
        return ans;
    }
}