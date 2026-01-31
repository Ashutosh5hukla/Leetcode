class Solution {
    public char nextGreatestLetter(char[] arr, char t) {
        int s=0;
        int e=arr.length-1;
        char ans=arr[0];
        while(s<=e){
            int m=s+(e-s)/2;
            if(arr[m]>t){
                ans=arr[m];
                e=m-1;
            }
            else s=m+1;
        }
        return ans;
    }
}