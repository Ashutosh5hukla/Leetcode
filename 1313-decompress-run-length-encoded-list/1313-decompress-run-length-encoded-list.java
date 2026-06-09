class Solution {
    public int[] decompressRLElist(int[] nums) {
        int sz= 0;
        for (int i = 0; i < nums.length; i += 2) {
            sz += nums[i];
        }
        int[] ans = new int[sz];
        int idx = 0;
        for (int i = 0; i < nums.length; i += 2) {
            int freq = nums[i];
            int val = nums[i + 1];
            while (freq-- > 0) {
                ans[idx++] = val;
            }
        }
        return ans;
    }
}