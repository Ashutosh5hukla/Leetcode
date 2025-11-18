class Solution {
    public int arrayPairSum(int[] arr) {
        Arrays.sort(arr);
        int i=0,s=0;
        while(i<arr.length){
            s+=arr[i];
            i+=2;
        }
        return s;
    }
}