class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1)return nums[0];
        if(n==2)return Math.max(nums[0],nums[1]);
        int dp1[]=new int[n];
        int dp2[]=new int[n];
        Arrays.fill(dp1,-1);
        Arrays.fill(dp2,-1);
        int case1 =tab(nums,dp1,0,n-1);
        int case2 =tab(nums,dp2,1,n);
        return Math.max(case1,case2);
    }
    int tab(int arr[],int dp[],int i,int n){
        dp[i]=arr[i];
        dp[i+1]=Math.max(arr[i],arr[i+1]);
        for(int j=i+2;j<n;j++){
            dp[j]=Math.max(dp[j-1],arr[j]+dp[j-2]);
        }
        return dp[n-1];
    } 
}