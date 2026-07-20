class Solution {
    public long maxAlternatingSum(int[] nums) {
        long even=0;
        long odd=nums[0];
        for(int i=1;i<nums.length;i++){
            long e=Math.max(odd-nums[i],even);
            long o=Math.max(even+nums[i],odd);
            even=e;
            odd=o;
        }
        return Math.max(even,odd);
    }
}