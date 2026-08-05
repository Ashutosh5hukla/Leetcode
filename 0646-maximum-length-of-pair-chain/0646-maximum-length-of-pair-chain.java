class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs,(a,b)->a[0]-b[0]); 
        int n=pairs.length;
        int dp[][] =new int[n+1][n+1];
        int ans=1;
        for(int i=n-1;i>=0;i--){
            for(int prev=i-1;prev>=-1;prev--){
                int nt=dp[i+1][prev+1];
                int t=0;
                if(prev==-1 || pairs[prev][1]<pairs[i][0]){
                    t=1+dp[i+1][i+1];
                }
                dp[i][prev+1]=Math.max(t,nt);
            }
        }
        return dp[0][0];
    }
}