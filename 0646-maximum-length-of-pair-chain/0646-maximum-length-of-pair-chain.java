class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs,(a,b)->a[0]-b[0]);
        int dp[][]=new int[pairs.length+1][pairs.length+1];
        for(int [] a:dp)Arrays.fill(a,-1);
        return help(pairs,-1,0,dp);
    }
    int help(int arr[][],int pi,int i,int dp[][]){
        if(i==arr.length)return 0;
        int t=0,s;
        if(dp[i][pi+1]!=-1)return dp[i][pi+1];
        if(pi==-1)t=1+help(arr,i,i+1,dp);
        else if(pi!=-1 && arr[pi][1]<arr[i][0]){
            t=1+help(arr,i,i+1,dp);
        }s=help(arr,pi,i+1,dp);
        return dp[i][pi+1]=Math.max(t,s);
    }
}