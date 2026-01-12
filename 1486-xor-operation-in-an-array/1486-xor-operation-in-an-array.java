class Solution {
    public int xorOperation(int n, int s) {
        int arr[]=new int [n];
        for(int i=0;i<arr.length;i++){
            arr[i]=s+2*i;
        }
        int ans=arr[0];
        for(int i=1;i<arr.length;i++){
            ans^=arr[i];
        }
        return ans;
    }
}