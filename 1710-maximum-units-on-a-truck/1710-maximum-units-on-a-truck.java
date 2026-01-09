class Solution {
    public int maximumUnits(int[][] arr, int ts) {
        Arrays.sort(arr,(b1,b2)->b2[1]-b1[1]);
        int unit=0;
        for(int i=0;i<arr.length;i++){
            if(ts==0)break;
            if(ts-arr[i][0]>0){
                unit+=(arr[i][1]*arr[i][0]);
                ts-=arr[i][0];
            }else{
                unit+=(arr[i][1]*ts);
                ts=0;
            }
        }
        return unit;
    }
}