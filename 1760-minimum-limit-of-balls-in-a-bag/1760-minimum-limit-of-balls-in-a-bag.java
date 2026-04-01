class Solution {
    public int minimumSize(int[] arr, int maxOperations) {
        Arrays.sort(arr);
        int s=1;
        int e=arr[arr.length-1];
        int ans=e;
        while(s<=e){
            int m=s+(e-s)/2;
            if(canMake(arr,maxOperations,m)){
                ans=m;
                e=m-1;
            }else{
                s=m+1;
            }
        }
        return ans;
    }
    boolean canMake(int arr[],int maxOps,int m){
        int ops=0;
        for(int i=0;i<arr.length;i++){
            ops+=(arr[i]-1)/m;
            if(ops>maxOps)return false;
        }
        return ops<=maxOps;
    }
}