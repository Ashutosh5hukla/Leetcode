class Solution {
    public long maxAlternatingSum(int[] arr) {
        int n = arr.length;
        long dp[][] = new long[n][2];
        dp[0][1] = arr[0];
        dp[0][0] = 0;
        for(int i = 1; i < n; i++) {
            // even (+)
            long t1 = dp[i-1][0] + arr[i];
            long s1 = dp[i-1][1];
            dp[i][1] = Math.max(t1, s1);
            // odd (-)
            long t2 = dp[i-1][1] - arr[i];
            long s2 = dp[i-1][0];
            dp[i][0] = Math.max(t2, s2);
        }
        return dp[n-1][1];
    }
}