class Solution {
    public int maxProfit(int[] arr) {
        int by=arr[0];
        int p=0;
        for(int i=1;i<arr.length;i++){
            if(by>arr[i])by=arr[i];
            else{
                p=Math.max(p,arr[i]-by);
            }
        }
        return p;
    }
}
