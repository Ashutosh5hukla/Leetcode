class Solution {
    public int maxSideLength(int[][] mat, int threshold) {
        if(mat == null || mat.length == 0 || mat[0].length == 0) return 0;
        int m = mat.length, n = mat[0].length;
        int maxLen = Math.min(m, n);
        int[][] presum = new int[m][n];
        buildPresum(presum, mat, m, n);
        
        for(int len = maxLen; len >= 1; len --) {
            for(int j = 0; j <= n - len; j++) {
                for(int i = 0; i <= m - len; i++) {
                    int sum = Integer.MAX_VALUE;
                    if(i == 0 || j == 0) {
                        sum = getSum(mat, i, j, len, threshold);
                    } else {
                        sum = presum[i+len-1][j+len-1] - presum[i-1][j+len-1] - presum[i+len-1][j-1] + presum[i-1][j-1];
                    }
                    if(sum <= threshold) return len;
                }
            }
        }
        return 0;
    }
    
    private void buildPresum(int[][] presum, int[][] mat, int m, int n) {
        presum[0][0] = mat[0][0];
        for(int i = 1; i < m; i++) presum[i][0] = mat[i][0] + presum[i-1][0];
        for(int i = 1; i < n; i++) presum[0][i] = mat[0][i] + presum[0][i-1];
        
        for(int i = 1; i < m; i++) {
            for(int j = 1; j < n; j++) {
                presum[i][j] = mat[i][j] + presum[i-1][j] + presum[i][j-1] - presum[i-1][j-1];
            }
        }
    }
    
    private int getSum(int[][] mat, int left, int down, int len, int threshold) {
        int sum = 0;
        for(int i = left; i < left + len; i++) {
            for(int j = down; j < down + len; j++) {
                sum += mat[i][j];
                if(sum > threshold) return Integer.MAX_VALUE;
            }
        }
        return sum;
    }
}