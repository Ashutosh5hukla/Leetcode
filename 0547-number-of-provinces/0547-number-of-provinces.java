class Solution {
    public int findCircleNum(int[][] adj) {
        boolean vis[]=new boolean[adj.length];
        int c=0;
        for(int i=0;i<adj.length;i++){
            if(!vis[i]){
                dfs(adj,vis,i);
                c++;
            }
        }
        return c;
    }
    public void dfs(int[][] adj,boolean vis[],int i){
        vis[i]=true;
        for(int j=0;j<adj.length;j++){
            if(adj[i][j]==1 && !vis[j]){
                dfs(adj,vis,j);
            }
        }
        
    }
}