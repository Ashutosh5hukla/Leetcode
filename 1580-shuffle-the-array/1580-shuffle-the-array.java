class Solution {
    public int[] shuffle(int[] arr, int n) {
        int ans[]=new int[2*n];
        boolean flag=true;
        int k=0;
        int i=0;
        int j=n;
        while(k<2*n){
            if(flag){
                ans[k]=arr[i];
                i++;
            }
            else{
                ans[k]=arr[j];
                j++;
            }
            flag=!flag;
            k++; 
        }
        return ans;
    }
}