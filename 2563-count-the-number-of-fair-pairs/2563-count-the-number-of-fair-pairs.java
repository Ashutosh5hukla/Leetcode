class Solution {
    public long countFairPairs(int[] arr, int l, int u) {
        Arrays.sort(arr);
        long c=0;
        for(int i=0;i<arr.length;i++){
           int lbi=bsl(arr,i+1,arr[i],l);
           int ubi=bsu(arr,i+1,arr[i],u);
            if(lbi !=-1 && ubi !=-1 && lbi<=ubi){
                c+=(ubi-lbi+1);
            }
        }
        return c;
    }
    int bsl(int arr[],int idx,int ele,int lb){
        int s=idx;
        int e=arr.length-1;
        int ans=-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(arr[m]+ele>=lb){
                ans=m;
                e=m-1;
            }else{
                s=m+1;
            }
        }
        return ans;
    }
    int bsu(int arr[],int idx,int ele,int ub){
        int s=idx;
        int e=arr.length-1;
        int ans=-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(arr[m]+ele<=ub){
                ans=m;
                s=m+1;
            }else{
                e=m-1;
            }
        }
        return ans;
    }
}