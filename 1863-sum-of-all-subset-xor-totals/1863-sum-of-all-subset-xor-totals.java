class Solution {
    public int subsetXORSum(int[] nums) {
        int arr[]=new int[1];
        return helper(nums,0,0,arr);
    }
    int helper(int [] nums,int i,int te,int ans[]){
        if(i==nums.length)return ans[0]+=te;
        int t=helper(nums, i+1,te^nums[i],ans);
        int s=helper(nums, i+1,te,ans);
        return ans[0];
    }

}