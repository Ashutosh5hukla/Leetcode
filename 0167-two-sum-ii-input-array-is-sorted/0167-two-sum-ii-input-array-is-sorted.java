class Solution {
    public int binarysearch(int[] arr,int target,int left){
        int right=arr.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                left=mid+1;
            }
            else {
                right=mid-1;
            }
        }
        return -1;
    }
    public int[] twoSum(int[] numbers, int target) {
        int[] res=new int[2];
        for(int i=0;i<numbers.length;i++){
            int another=target-numbers[i];
           int j=binarysearch(numbers,another,i+1);
           if(j!=-1){
            res[0]=i+1;
            res[1]=j+1;
            return res;
           }
        }
        return res;
    }
}