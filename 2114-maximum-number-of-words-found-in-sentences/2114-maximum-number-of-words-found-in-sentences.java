class Solution {
    public int mostWordsFound(String[] sen) {
        int ans=0;
        for(int i=0;i<sen.length;i++){
            int len=sen[i].split(" ").length;
            ans=Math.max(ans,len);
        }
        return ans;
    }
}