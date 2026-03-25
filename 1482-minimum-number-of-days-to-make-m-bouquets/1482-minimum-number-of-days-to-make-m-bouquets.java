class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if(m*k > bloomDay.length)return -1;
        int ans=-1;
        int s=1;
        int e=mx(bloomDay);
        while(s<=e){
            int M=s+(e-s)/2;
            if(check(bloomDay,m,k,M)){
                ans=M;
                e=M-1;
            }else{
                s=M+1;
            }
        }
        return ans;
    }
    private int mx(int[] arr) {
        int mx=0;
        for (int x : arr)mx=Math.max(mx,x);
        return mx;
    }
    static boolean check(int arr[],int nfb,int k,int m){
        int c=0;
        int ans=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=m){
                c++;
                if(c==k){
                    ans+=1;
                    c=0;
                }
            }else{
                c=0;
            }
        }
        return ans>=nfb;
    }
}