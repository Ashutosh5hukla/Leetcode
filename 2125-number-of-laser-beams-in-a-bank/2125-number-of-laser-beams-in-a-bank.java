class Solution {
    public int numberOfBeams(String[] bank) {
        int prev=0;
        int ans=0;
        for(String s:bank){
            int cnt=0;
            for(char ch:s.toCharArray()){
                if(ch=='1'){
                    cnt++;
                }
            }
            if(prev!=0){
                ans+=cnt*prev;
               
            }
            if(cnt!=0){
                prev=cnt;
            }
        }
        return ans;
    }
}