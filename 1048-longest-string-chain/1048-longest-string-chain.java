class Solution {
    public int longestStrChain(String[] words) {
        Arrays.sort(words,(a,b)->a.length()-b.length());
        int n=words.length;
        int[][] dp=new int[n+1][n+1];
        for(int i=n-1;i>=0;i--){
            for(int prev=i-1;prev>=-1;prev--){
                int take=0;
                if(prev==-1 || pred(words[prev],words[i])){
                    take=1+dp[i+1][i+1];
                }
                int skip=dp[i+1][prev+1];
                dp[i][prev+1]=Math.max(take,skip);
            }
        }
        return dp[0][0];
    }
    boolean pred(String wa,String wb){
        if(wb.length()!=wa.length()+1)return false;
        int i=0,j=0;
        boolean used=false;
        while(i<wa.length() && j<wb.length()){
            if(wa.charAt(i)==wb.charAt(j)){
                i++;
                j++;
            }else{
                if(used)return false;
                used=true;
                j++;
            }
        };
        return true;
    }
}