class Solution {
    public int countMaxOrSubsets(int[] nums) {
        int mx=0;
        for(int i=0;i<nums.length;i++){
            mx |= nums[i];
        }
        int c=helper(nums,0,mx,0);
        return c;
    }
    int helper(int arr[],int i,int mx,int curr){
        
        if(i==arr.length){
            if(curr==mx)return 1;
            else return 0;
        }
        int t=helper(arr,i+1,mx,curr|arr[i]);
        int s=helper(arr,i+1,mx,curr);

        return t+s;
    }

}