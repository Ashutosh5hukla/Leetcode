class Solution {
    public int[] searchRange(int[] nums, int target) {
        int arr[]={search(nums,target,true),search(nums,target,false)};
        return arr;
    }


     int search(int arr[],int target,boolean f){
        int start=0;
        int end=arr.length-1;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>arr[mid]){
                start=mid+1;
            }
            if(target<arr[mid]){
                end=mid-1;
            }
            if(arr[mid]==target) {         
                ans=mid;
                if(f){
                end=mid-1;
                }
                else{
                    start=start+1;
                }
            }
        }
        return ans;
     }
     
}