class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1)return nums[0];
        return Math.max(solve(nums,0,n-2),solve(nums,1,n-1));
    }
    int solve(int arr[],int s,int e){
        if(s==e) return arr[s];
        int dp[]=new int[3];
        dp[0]=arr[s];
        dp[1]=Math.max(arr[s],arr[s+1]);
        dp[2]=dp[1];
        for(int i=s+2;i<=e;i++){
            dp[2]=Math.max(dp[1],dp[0]+arr[i]);
            dp[0]=dp[1];
            dp[1]=dp[2];
        }
        return dp[2];
    }
    
}