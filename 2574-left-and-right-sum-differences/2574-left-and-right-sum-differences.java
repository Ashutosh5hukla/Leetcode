class Solution {
    public int[] leftRightDifference(int[] arr) {
        int n=arr.length;
        int lsa[]=new int[n];
        int rsa[]=new int[n];
        int ans[]=new int[n];
        int ls=0;
        int rs=0;
        for(int i=0;i<n;i++){
            lsa[i]=ls;
            ls+=arr[i];
        } 
        for(int i=n-1;i>=0;i--){
            rsa[i]=rs;
            rs+=arr[i];
        }
        for(int i=0;i<n;i++){
            ans[i]=Math.abs(rsa[i]-lsa[i]);
        }
        return ans;
    }
}