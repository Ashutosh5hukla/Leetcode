class Solution {
    public int minimumCost(int[] arr) {
        Arrays.sort(arr);
        if(arr.length==1)return arr[0];
        if(arr.length==2)return arr[0]+arr[1];
        int res=0;
        int cnt=0;
        for(int i=arr.length-1;i>=0;i--){
            if(cnt!=2){
                res+=arr[i];
                cnt++;
            }else if(cnt==2)cnt=0;
        }
        return res;
    }
}