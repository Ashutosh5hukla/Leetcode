class Solution {
    public int minimizeArrayValue(int[] arr) {
        int s=arr[0];
        int e=(int)1e9;
        int ans=-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(valid(m,arr)){
                ans=m;
                e=m-1;
            }
            else s=m+1;
        }
        return ans;
    }
    boolean valid(int m,int arr[]){
        if(m<arr[0])return false;
        long req=m-arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>m){
                long curr=arr[i]-m;
                if(curr>req)return false;
                else req-=curr;
            }else{
                req+=(m-arr[i]);
            }
        }
        return true;
    }

}