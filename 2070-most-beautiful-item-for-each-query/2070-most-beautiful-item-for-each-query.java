class Solution {
    public int[] maximumBeauty(int[][] items, int[] queries) {
        // Arrays.sort(items,(a,b)->{
        //     if(a[0]==b[0])return b[1]-a[1];
        //     return a[0]-b[0];
        // });
        Arrays.sort(items, (a, b) -> a[0] - b[0]);
        int mxTillNow[]=new int[items.length];
        int mx=0;
        for(int i=0;i<items.length;i++){
            mx=Math.max(mx,items[i][1]);
            mxTillNow[i]=mx;
        }
        int ans[]=new int[queries.length];
        for(int i=0;i<queries.length;i++){
            int idx=bs(items,queries[i]);//bs on price like upper bound
            if(idx!=-1)ans[i]=mxTillNow[idx];
            else ans[i]=0;
        }
        return ans;
    }
    int bs(int arr[][],int price){
        int s=0;
        int e=arr.length-1;
        int ans=-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(arr[m][0]<=price){
                ans=m;
                s=m+1;
            }else{
                e=m-1;
            }
        }
        return ans;
    }
}