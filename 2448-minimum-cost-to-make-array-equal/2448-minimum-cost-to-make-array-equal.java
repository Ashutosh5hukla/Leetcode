class Solution {
    public long minCost(int[] nums, int[] cost) {
        int s=Integer.MAX_VALUE;
        int e=Integer.MIN_VALUE;
        for(int ele : nums){
            if(ele>e)e=ele;
            if(ele<s)s=ele;
        }
        long ans=Long.MAX_VALUE;
        while(s<=e){
            int m=s+(e-s)/2;
            long c1=cal(nums,cost,m);
            long c2=cal(nums,cost,m+1);
            if(c1<c2){
                ans=Math.min(ans,c1);
                e=m-1;
            }else{
                ans=Math.min(ans,c2);
                s=m+1;
            }
        }
        return ans;
    }
    long cal(int nums[],int cost[],int m){
        long ans=0;
        for(int i=0;i<nums.length;i++){
            ans += (long) Math.abs(nums[i] - m) * cost[i];
        }
        return ans;
    }
}