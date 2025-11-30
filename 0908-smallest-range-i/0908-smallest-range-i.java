class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int maxi=Integer.MIN_VALUE;
        int mini=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            maxi=Math.max(maxi,nums[i]);
            mini=Math.min(mini,nums[i]);
        }
        int a=mini+k;
        int b=maxi-k;
        int c=b-a;
        if(c<0)
        {
            return 0;
        }

        return c;
    }
}