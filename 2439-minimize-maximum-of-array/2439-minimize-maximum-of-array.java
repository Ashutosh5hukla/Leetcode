class Solution {
    int max(int arr[]){
        int m=Integer.MIN_VALUE;
        for(int ele:arr)m=Math.max(m,ele);
        return m;
    }
    public int minimizeArrayValue(int[] arr) {
        int s=arr[0];
        int e=max(arr);
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