class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1)return nums[0];
        return Math.max(solve(nums,0,n-2),solve(nums,1,n-1));
    }
    int solve(int arr[],int s,int e){
        if(s==e) return arr[s];
        int dp[]=new int[arr.length];
        dp[s]=arr[s];
        dp[s+1]=Math.max(arr[s],arr[s+1]);
        for(int i=s+2;i<=e;i++){
            dp[i]=Math.max(dp[i-1],dp[i-2]+arr[i]);
        }
        return dp[e];
    }
    
}