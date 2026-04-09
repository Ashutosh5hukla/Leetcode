class Solution {
    public int rob(int[] nums) {
        int dp[]=new int[nums.length+1];
        Arrays.fill(dp,-1);
        return  helper(nums,0,dp);
        
    }
    int helper(int arr[],int i,int dp[]){
        if(i>=arr.length)return 0;
        if(dp[i]!=-1)return dp[i];
        int t=arr[i]+helper(arr,i+2,dp);
        int s=helper(arr,i+1,dp);
        return dp[i]= Math.max(t,s);
    }

}