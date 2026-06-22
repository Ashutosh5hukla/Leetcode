class Solution {
    public int digitFrequencyScore(int n) {
        String arr[]=(n+"").split("");
        int s=0;
        for(int i=0;i<arr.length;i++){
            s+=Integer.parseInt(arr[i]);
        }
        return s;
    }
}