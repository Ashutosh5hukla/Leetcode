class Solution {
    public int maxSubArray(int[] arr) {
        int s=0;
        int m=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            s+=arr[i];
            if(s>m)m=s;;
            if(s<0)s=0;
        }
        return m;
    }
}