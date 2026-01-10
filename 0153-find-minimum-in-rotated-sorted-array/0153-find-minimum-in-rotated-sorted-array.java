class Solution {
    public int findMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        int s=0;
        int e=arr.length-1;

        while(s<=e){
            int m=s+(e-s)/2;
            if(arr[s]<=arr[m]){
                min=Math.min(min,arr[s]);
                s=m+1;
            }else{
                min=Math.min(min,arr[m]);
                e=m-1;
            }
        }
        return min;
    }
}