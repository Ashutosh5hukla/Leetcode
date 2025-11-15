class Solution {
    public int[] smallerNumbersThanCurrent(int[] arr) {
        int ans[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int s=0;
            for(int j=0;j<arr.length;j++){
                if(i==j)continue;
                if(arr[i]>arr[j])s++;
            }
            ans[i]=s;
        }
        return ans;
    }
}