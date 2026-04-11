class Solution {
    public long maxAlternatingSum(int[] nums) {
        long dp[][]=new long[nums.length][2];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
        long ans=helper(nums,0,1,dp);//1==iseven
        return ans;
    }
    long helper(int arr[],int i,int isEven,long dp[][]){
        if(i>=arr.length)return 0;
        if(dp[i][isEven]!=-1)return dp[i][isEven];
        long s=helper(arr,i+1,isEven,dp);
        long t;
        if(isEven==1){
            t=arr[i]+helper(arr,i+1,0,dp);
        }else{
            t=helper(arr,i+1,1,dp)-arr[i];
        }
        return dp[i][isEven]=Math.max(t,s);
    }
}