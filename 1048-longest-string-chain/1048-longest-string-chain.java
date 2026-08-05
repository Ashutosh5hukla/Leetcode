class Solution {
    public int longestStrChain(String[] words) {
        Arrays.sort(words,(a,b)->a.length()-b.length());
        int n=words.length;
        int dp[][]=new int[n+1][n+1];
        for(int i=0;i<dp.length;i++)Arrays.fill(dp[i],-1); 
        return helper(words,0,-1,dp);
    }
    int helper(String[] w,int i,int prev,int dp[][]){
        if(i==w.length)return 0;
        int t=0,s=0;
        if(prev!=-1 && dp[i][prev]!=-1)return dp[i][prev];
        
        if(prev==-1 || pred(w[prev],w[i])){
            t=1+helper(w,i+1,i,dp);
        }
        s=helper(w,i+1,prev,dp);
        if(prev!=-1)return dp[i][prev]=Math.max(t,s);
        return Math.max(t,s);
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