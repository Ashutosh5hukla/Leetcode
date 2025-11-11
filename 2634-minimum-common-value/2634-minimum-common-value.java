class Solution {
    public int getCommon(int[] n1, int[] n2) {
        for(int i=0;i<n1.length;i++){
            if(bs(n2,n1[i])!=-1)return n1[i];
        }
        return -1;
    }
    int bs(int arr[],int t){
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(arr[m]==t)return m;
            if(t<arr[m])e=m-1;
            else s=m+1;
        }
        return -1;
    }
}