class Solution {
    public int specialArray(int[] nums) {
        int s=0;
        int e=nums.length;
        Arrays.sort(nums);
        while(s<=e){
            int m=s+(e-s)/2;
            if((nums.length-lb(m,nums))==m)return m;
            if((nums.length-lb(m,nums))<m)e=m-1;
            else s=m+1;
        }
        return -1;
    }
    int lb(int x,int arr[]){
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(arr[m]>=x){
                e=m-1;
            }else s=m+1;
        }
        return s;
    }
}