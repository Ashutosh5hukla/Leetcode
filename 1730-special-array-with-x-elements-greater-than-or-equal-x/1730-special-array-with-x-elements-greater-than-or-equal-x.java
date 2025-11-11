class Solution {
    public int specialArray(int[] arr) {
        int s=0;
        int e=arr.length;
        int x=-1;
        while(s<=e){
            int m=s+(e-s)/2;
            System.out.print(m+",");
            int ans=s(arr,m);
            if(ans==m){
                x=m;
                s=m+1;
                
            }
            else if(ans>m)s=m+1;
            else e=m-1;
        }
        return x;
    }
    int s(int arr[],int x){
        int c=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=x)c++;
        }
        return c;
    }
}