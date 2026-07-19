class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1)return nums[0];
        if(n==2)return Math.max(nums[0],nums[1]);
        int dp1[]=new int[n];
        int dp2[]=new int[n];
        Arrays.fill(dp1,-1);
        Arrays.fill(dp2,-1);
        return Math.max(help(nums,0,dp1,nums.length-1),help(nums,1,dp2,nums.length));

    }
    int help(int arr[],int i,int dp[],int n){
        if(i>=n)return 0;
        if(dp[i]!=-1)return dp[i];
        int t=arr[i]+help(arr,i+2,dp,n);
        int s=help(arr,i+1,dp,n);
        return dp[i]=Math.max(t,s);
    }
}