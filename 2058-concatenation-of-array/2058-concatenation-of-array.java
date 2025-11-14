class Solution {
    public int[] getConcatenation(int[] arr) {
        int ans[]=new int[arr.length*2];
        for(int i=0;i<ans.length;i++){
            ans[i]=arr[i%arr.length];
        }
        return ans;
    }
}