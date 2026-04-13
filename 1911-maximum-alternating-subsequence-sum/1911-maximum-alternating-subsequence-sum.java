class Solution {
    public long maxAlternatingSum(int[] arr) {
        int n=arr.length;
        long dp[][]=new long[n][2];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        long ans=helper(arr,0,1,dp);
        return ans;
    }
    long helper(int[]arr,int i,int isEven,long[][] dp){
        if(i>=dp.length)return 0;
        if(dp[i][isEven]!=-1)return dp[i][isEven];
        long s=helper(arr,i+1,isEven,dp);
        long t;
        if(isEven==1){//even idx so add
            t=arr[i]+helper(arr,i+1,0,dp);
        }else{//odd so sub
            t=helper(arr,i+1,1,dp)-arr[i];
        }
        return dp[i][isEven]=Math.max(t,s);
    }
}