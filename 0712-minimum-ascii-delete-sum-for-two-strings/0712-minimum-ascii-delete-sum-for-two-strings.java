class Solution {
    public int minimumDeleteSum(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();
        int[][] t = new int[m + 1][n + 1];
        for (int[] row : t) 
            Arrays.fill(row, -1);
        int lcs_ASCII = helper(text1, text2, m, n, t);

        int text1_ASCII = 0, text2_ASCII = 0;
        for (int i = 0; i < m; i++) text1_ASCII += text1.charAt(i);
        for (int j = 0; j < n; j++) text2_ASCII += text2.charAt(j);

        return text1_ASCII + text2_ASCII - 2 * lcs_ASCII;
    }

    public int helper(String x, String y, int m, int n, int[][] t) {
        if (m == 0 || n == 0) return 0;

        if (t[m][n] != -1) return t[m][n];

        if (x.charAt(m - 1) == y.charAt(n - 1)) {
            t[m][n] = x.charAt(m - 1) + helper(x, y, m - 1, n - 1, t);
        } else {
            t[m][n] = Math.max(helper(x, y, m - 1, n, t), helper(x, y, m, n - 1, t));
        }

        return t[m][n];
    }
}