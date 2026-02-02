class Solution {
    public int findJudge(int n, int[][] trust) {
        int ans[]=new int[n];
        Arrays.fill(ans,0);
        for(int []arr : trust){
            int ai=arr[0];
            int bi=arr[1];
            ans[ai-1]--;
            ans[bi-1]++;
        }
        for(int i=0;i<ans.length;i++){
            if(ans[i]==n-1)return i+1;
        }
        return -1;
    }
}