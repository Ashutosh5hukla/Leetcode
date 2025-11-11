class Solution {
    public int getCommon(int[] arr, int[] brr) {
        int n1=arr.length;
        int n2=brr.length;
        int i=0,j=0;
        while(i<n1 && j<n2){
            if(arr[i]==brr[j])return arr[i];
            if(arr[i]<brr[j])i++;
            else j++;
        }
        return -1;
    }
}