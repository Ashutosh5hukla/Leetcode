class Solution {
    public int[] constructTransformedArray(int[] arr) {
        int n=arr.length;
        int res[]=new int[n];
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                res[i]=arr[(i+arr[i])%n];
            }else if(arr[i]<0){
                res[i]=arr[(i+n-Math.abs(arr[i]))%n];
            }else{//arr[i]==0
                res[i]=arr[i];
            }
        }
        return res;
    }
}