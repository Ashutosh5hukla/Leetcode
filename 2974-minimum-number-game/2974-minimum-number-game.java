class Solution {
    public int[] numberGame(int[] arr) {
        int ans[]=new int[arr.length];
        Arrays.sort(arr);
        int j=0;
        for(int i=1;i<arr.length;i+=2){
            ans[j]=arr[i];
            j++;
            ans[j]=arr[i-1];
            j++;
        }
        return ans;
    }
}