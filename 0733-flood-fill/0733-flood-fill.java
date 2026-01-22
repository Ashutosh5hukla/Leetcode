class Solution {
    public int[][] floodFill(int[][] adj, int sr, int sc, int color) {
        boolean vis[][]=new boolean[adj.length][adj[0].length];
        bfs(adj,vis,sr,sc,adj[sr][sc]);
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
    void bfs(int [][] adj,boolean vis[][],int sr,int sc,int col){
        vis[sr][sc]=true;
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(sr,sc));
        while(!q.isEmpty()){
            Pair t=q.remove();
            int r=t.sr;
            int c=t.sc;
            if(r>0 && adj[r-1][c]==col && vis[r-1][c]==false){
                q.add(new Pair(r-1,c));
                vis[r-1][c]=true;
            }
            if(c>0 && adj[r][c-1]==col && vis[r][c-1]==false){
                q.add(new Pair(r,c-1));
                vis[r][c-1]=true;
            }
            if(r<adj.length-1 && adj[r+1][c]==col && vis[r+1][c]==false){
                q.add(new Pair(r+1,c));
                vis[r+1][c]=true;
            }
            if(c<adj[0].length-1 && adj[r][c+1]==col && vis[r][c+1]==false){
                q.add(new Pair(r,c+1));
                vis[r][c+1]=true;
            }
        }

    }
}