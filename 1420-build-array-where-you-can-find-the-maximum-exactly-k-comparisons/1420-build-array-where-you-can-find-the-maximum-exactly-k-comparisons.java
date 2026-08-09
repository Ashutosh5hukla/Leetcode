class Solution {
    static final int MOD=1000000007;
    public int numOfArrays(int n, int m, int k) {
        int dp[][][]=new int[n+1][k+1][m+1];
        for(int[][] a:dp){
            for(int[] b:a){
                Arrays.fill(b,-1);
            }
        }
        int ans=solve(dp,0,0,0,n,m,k);
        return ans;
    }
    int solve(int dp[][][],int idx,int sc,int mxsofar,int n,int m,int k){
            if(idx>=n){
                if(sc==k)return 1;
                else return 0;
            }
            if(sc>k)return 0;
            if(dp[idx][sc][mxsofar]!=-1)return dp[idx][sc][mxsofar];
            int res=0;
            for(int i=1;i<=m;i++){
                if(i>mxsofar){
                    res=(res+solve(dp,idx+1,sc+1,i,n,m,k))%MOD;
                }else{
                    res=(res+solve(dp,idx+1,sc,mxsofar,n,m,k))%MOD;
                }
            }
            return dp[idx][sc][mxsofar]=res;
    }

}