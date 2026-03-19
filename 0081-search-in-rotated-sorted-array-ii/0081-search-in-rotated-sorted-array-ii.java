class Solution {
    public boolean search(int[] arr, int t) {
         int s=0;
        int e=arr.length-1;
        while(s<e){
            int m=s+(e-s)/2;
            if(arr[m]==t)return true;
            if (arr[s] == arr[m] && arr[e] == arr[m]) {
            s++;
            e--;
        }else if(arr[s]<=arr[m]){
                if(t>=arr[s] && t<arr[m]){
                    e=m-1;
                }else{
                    s=m+1;
                }
        }else{
            if(t>arr[m] && t<=arr[e]){
                    s=m+1;
            }else{
                e=m-1;
            }
        }
        }
        return arr[s]==t;
    }
}
