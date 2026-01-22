class Solution {
    public int[][] floodFill(int[][] adj, int sr, int sc, int color) {
        boolean vis[][]=new boolean[adj.length][adj[0].length];
        dfs(adj,vis,sr,sc,adj[sr][sc]);
        for(int i=0;i<adj.length;i++){
            for(int j=0;j<adj[i].length;j++){
                if(vis[i][j])adj[i][j]=color;
            }
        }
        return adj;
    }
    public class Pair{
        int sr;
        int sc;
        Pair(int sr,int sc){
            this.sr=sr;
            this.sc=sc;
        }
    }
    void dfs(int [][] adj,boolean vis[][],int r,int c,int col){
        vis[r][c]=true;
            if(r>0 && adj[r-1][c]==col && vis[r-1][c]==false){
                dfs(adj,vis,r-1,c,col);
            }
            if(c>0 && adj[r][c-1]==col && vis[r][c-1]==false){
                dfs(adj,vis,r,c-1,col);
            }
            if(r<adj.length-1 && adj[r+1][c]==col && vis[r+1][c]==false){
                dfs(adj,vis,r+1,c,col);
            }
            if(c<adj[0].length-1 && adj[r][c+1]==col && vis[r][c+1]==false){
                dfs(adj,vis,r,c+1,col);
            }

    }
}