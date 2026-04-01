class Solution {
    public int minimizedMaximum(int n, int[] arr) {
        Arrays.sort(arr);
        int s=1;
        int e=arr[arr.length-1];
        int ans=e;
        while(s<=e){
            int m=s+(e-s)/2;
            if(check(n,arr,m)){
                ans=m;
                e=m-1;
            }else{
                s=m+1;
            }
        }
        return ans;
    }
    boolean check(int n,int arr[],int maxPerStore){
        int stores=0;
        for(int i=0;i<arr.length;i++){
            stores += (int)Math.ceil((double)arr[i] / maxPerStore);
        }
        return stores<=n;
    }
}