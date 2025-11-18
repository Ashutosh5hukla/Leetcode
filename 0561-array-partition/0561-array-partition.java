class Solution {
    public int arrayPairSum(int[] arr) {
        Arrays.sort(arr);
        int i=1,s=0;
        while(i<arr.length){
            s+=Math.min(arr[i-1],arr[i]);
            i+=2;
        }
        return s;
    }
}