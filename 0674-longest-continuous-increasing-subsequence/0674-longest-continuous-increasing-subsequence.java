class Solution {
    public int findLengthOfLCIS(int[] arr) {
        if (arr.length == 0) return 0;

        int ans = 1;
        int l = 0;

        for (int r = 1; r < arr.length; r++) {
            if (arr[r] > arr[r - 1]) {
                ans = Math.max(ans, r - l + 1);
            } else {
                l = r;
            }
        }
        return ans;
    }
}
