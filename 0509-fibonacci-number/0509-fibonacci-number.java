class Solution {
    public int fib(int n) {
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        if(n==0 || n==1)return n;
        dp[0]=0;
        dp[1]=1;

        return nemo(n,dp);
        // return dp[dp.length-1];
    }
    int nemo(int n,int arr[]){
        if(arr[n]!=-1)return arr[n];
        return arr[n]=nemo(n-1,arr)+nemo(n-2,arr);    
    }
}