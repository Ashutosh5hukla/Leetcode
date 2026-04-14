class Solution {
    public long maxAlternatingSum(int[] arr) {
        int n = arr.length;
        long dp[][] = new long[n][2];
        long even=arr[0];
        long odd=0;
        
        for(int i = 1; i < n; i++) {
            long pre_odd=odd;
            long pre_even=even;
            //even +
            long t1=pre_odd+arr[i];
            long s1=pre_even;
            even=Math.max(t1,s1);
            // odd -
            long t2=pre_even-arr[i];
            long s2=pre_odd;
            odd=Math.max(t2,s2);
        }
        return even;
    }
}