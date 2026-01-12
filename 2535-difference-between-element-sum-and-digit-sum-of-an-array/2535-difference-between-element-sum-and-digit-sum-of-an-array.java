class Solution {
    public int differenceOfSum(int[] arr) {
        int es=0;
        int ds=0;
        for(int i=0;i<arr.length;i++){
            es+=arr[i];
            int t=arr[i];
            while(t!=0){
                ds+=t%10;
                t/=10;
            }
        }
        return Math.abs(es-ds);
    }
}