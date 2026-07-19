class Solution {
    public long maxAlternatingSum(int[] nums) {
        long dp[][]=new long[nums.length][2];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
        return help(nums,0,1,dp);
    }
    long help(int arr[],int i,int ev,long[][] dp){
        if(i>=arr.length)return 0;
        long t,s;
        if(dp[i][ev]!=-1)return dp[i][ev];
        if(ev==1)t=arr[i]+help(arr,i+1,ev-1,dp);
        else t=-arr[i]+help(arr,i+1,ev+1,dp);
        s=help(arr,i+1,ev,dp);
        return dp[i][ev]=Math.max(t,s);
    }
}