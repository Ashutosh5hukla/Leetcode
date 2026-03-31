class Solution {
    int swc(int[] arr,int dist){
        int i=0;
        int j=1;
        int n=arr.length;
        int paircnt=0;
        while(j<n){
            while(arr[j]-arr[i]>dist){
                i++;
            }
            paircnt+=(j-i);
            j++;
        }
        return paircnt;
    }
    public int smallestDistancePair(int[] arr, int k) {
        Arrays.sort(arr);
        int s=0;
        int e=arr[arr.length-1]-arr[0];
        int ans=0;
        while(s<=e){
            int m=s+(e-s)/2;
            int countPair=swc(arr,m);
            if(countPair<k){
                s=m+1;
            }else{
                ans=m;
                e=m-1;
            }
        }
        return ans;
    }
}