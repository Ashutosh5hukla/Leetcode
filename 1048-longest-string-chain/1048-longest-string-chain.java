class Solution {
    public int longestStrChain(String[] words) {
        Arrays.sort(words,(a,b)->a.length()-b.length());
        int n=words.length;
        int dp[][]=new int[n+1][n+1];
        for(int i=n-1;i>=0;i--){
            for(int p=i-1;p>=-1;p--){
                if(p==-1 || pred(words[p],words[i])){
                    dp[i][p+1]=Math.max(dp[i+1][i+1]+1,dp[i+1][p+1]);
                }else{
                    dp[i][p+1]=dp[i+1][p+1];
                }
            }
        }
        return dp[0][0];
    }
    // int helper(String[] w,int i,int prev,int dp[][]){
    //     if(i==w.length)return 0;
    //     int t=0;
    //     if( dp[i][prev+1]!=-1)return dp[i][prev+1];
        
    //     if(prev==-1 || pred(w[prev],w[i])){
    //         t=1+helper(w,i+1,i,dp);
    //     }
    //     int s=helper(w,i+1,prev,dp);
    //     return dp[i][prev+1]=Math.max(t,s);
    // }
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