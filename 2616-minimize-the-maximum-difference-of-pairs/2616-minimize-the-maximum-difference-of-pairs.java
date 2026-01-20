class Solution {
    public int minimizeMax(int[] arr, int p) {
        Arrays.sort(arr);
        int s=0;
        int e=arr[arr.length-1]-arr[0];
        int ans=e;
        while(s<=e){
            int m=s+(e-s)/2;
            if(check(m,arr,p)){
                ans=m;
                e=m-1;
            }else{
                s=m+1;
            }
        }
        return ans;
    }
    boolean check(int m,int arr[],int p){
        int c=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]-arr[i]<=m){
                c++;
                i++;
            }
            if(c>=p)return true;
        }
         return false;
    }
}