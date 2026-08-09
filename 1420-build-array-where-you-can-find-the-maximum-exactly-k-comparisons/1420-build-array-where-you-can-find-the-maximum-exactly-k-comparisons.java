class Solution {
    static final int MOD=1000000007;
    public int numOfArrays(int n, int m, int k) {
        int dp[][][]=new int[n+1][k+1][m+1];
            for(int mx=0;mx<=m;mx++){
                dp[n][k][mx]=1;
            }
        int ans=0;
        for(int idx=n-1;idx>=0;idx--){
            for(int sc=0;sc<=k;sc++){
                for(int mxsofar=0;mxsofar<=m;mxsofar++){
                    int res=0;
                    for(int i=1;i<=m;i++){
                        if(mxsofar<i){
                            if(sc<k)res=(res+dp[idx+1][sc+1][i])%MOD;
                        }else{
                            res=(res+dp[idx+1][sc][mxsofar])%MOD;
                        }
                    }
                    dp[idx][sc][mxsofar]=res;
                }
            }
        }
        return dp[0][0][0];
    }
}