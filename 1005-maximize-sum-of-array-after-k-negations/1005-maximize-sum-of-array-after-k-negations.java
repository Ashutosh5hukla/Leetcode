class Solution {
    public int largestSumAfterKNegations(int[] arr, int k) {
        int i=0;
        Arrays.sort(arr);
        while(i<arr.length && arr[i]<=0 && k!=0){
            arr[i]*=-1;
            k--;
            i++;
        }
        if(k%2!=0){
            Arrays.sort(arr);
            arr[0]=arr[0]*-1;
        }
        int s=0;
        for(int ele : arr){
            s+=ele;
        }
        return s;
    }
}