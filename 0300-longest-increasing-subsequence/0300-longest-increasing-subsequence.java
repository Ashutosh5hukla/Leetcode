class Solution {
    public int lengthOfLIS(int[] nums) {
        int dp[][] = new int[nums.length][nums.length + 1];
        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], -1);
        }
        return helper(nums, 0, -1, dp);
    }

    int helper(int arr[], int i, int prevIdx, int dp[][]) {
        if (i >= arr.length) return 0;
        if (dp[i][prevIdx + 1] != -1)return dp[i][prevIdx + 1];
        int t = 0;
        if (prevIdx == -1) {
            t = 1 + helper(arr, i + 1, i, dp);
        }
        else if (arr[prevIdx] < arr[i]) {
            t = 1 + helper(arr, i + 1, i, dp);
        }
        int s = helper(arr, i + 1, prevIdx, dp);
        return dp[i][prevIdx + 1] = Math.max(t, s);
    }
}