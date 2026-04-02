class Solution {
    public int maximumCandies(int[] arr, long k) {
        Arrays.sort(arr);
        int res=0;
        int s=1;
        int e=arr[arr.length-1];
        while(s<=e){
            int m=s+(e-s)/2;
            if(check(arr,m,k)){
                res=m;
                s=m+1;
            }else{
                e=m-1;
            }
        }
        return res;
    }
    boolean check(int arr[],int posibleAns,long k){
        long cnt=0;
        for(int i=0;i<arr.length;i++){
            cnt+= Math.ceil(arr[i]/posibleAns);
        }
        return cnt>=k;
    }
}