class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1)return nums[0];
        int dp1[]=new int[n];
        int dp2[]=new int[n];
        Arrays.fill(dp1,-1);
        Arrays.fill(dp2,-1);
        int case1 =helper(nums,0,n-1,dp1);
        int case2 =helper(nums,1,n,dp2);
        return Math.max(case1,case2);
    }
    int helper(int arr[],int i,int n,int dp[]){
        if(i>=n)return 0;
        if(dp[i]!=-1)return dp[i];
        int t=arr[i]+helper(arr,i+2,n,dp);
        int s = helper(arr,i+1,n,dp);
        return dp[i]=Math.max(t, s);
    }
}