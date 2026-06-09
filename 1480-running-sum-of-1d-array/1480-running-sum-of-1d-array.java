class Solution {
    public int[] runningSum(int[] nums) {
        int pre[]=new int[nums.length];
        int s=0;
        for(int i=0;i<nums.length;i++){
            s+=nums[i];
            pre[i]=s;
        }
        return pre;
    }
}