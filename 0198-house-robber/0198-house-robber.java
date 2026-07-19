class Solution {
    public int rob(int[] nums) {
        int dp[]=new int[nums.length+1];
        Arrays.fill(dp,-1);
        return help(nums,dp,0,nums.length);
        
    }

    int help(int nums[],int dp[],int i,int n){
        if(i>=n)return 0;
        if(dp[i]!=-1)return dp[i];
        int t=nums[i]+help(nums,dp,i+2,n);
        int s=help(nums,dp,i+1,n);
        return dp[i]=Math.max(t,s);
    }
}