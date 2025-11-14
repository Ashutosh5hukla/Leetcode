class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {
        int oc=0;
        int i=0;
        int c=0;
        while(i<arr.length){
            c=0;
            while(i<arr.length && arr[i]==1){
                c++;
                i++;
            }
            oc=Math.max(oc,c);
            i++;
        }
        return Math.max(oc,c);
    }
}