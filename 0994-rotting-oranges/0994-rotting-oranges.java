class Solution {
    class Triplet{
        int ro;
        int co;
        int t;
        Triplet(int ro,int co,int t){
            this.ro=ro;
            this.co=co;
            this.t=t;
        }
    }
    public int orangesRotting(int[][] grid) {
        Queue<Triplet> q=new LinkedList<>();
        int n=grid.length;
        int m=grid[0].length;
        boolean vis[][]=new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    vis[i][j]=true;
                    q.add(new Triplet(i,j,0));
                }
            }
        }
        int c=bfs(grid,vis,q,n,m);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]!=0 && vis[i][j]==false)return -1;
            }
        }
        return c;
    }
    int bfs(int[][] arr,boolean vis[][],Queue<Triplet> q,int n,int m){
        int c=0;
        while(!q.isEmpty()){
            Triplet tr=q.remove();
            int row=tr.ro;
            int col=tr.co;
            c=tr.t;
            if(row>0 && arr[row-1][col]==1 && !vis[row-1][col]){
                vis[row-1][col]=true;
                q.add(new Triplet(row-1,col,c+1));
            }
            if(col>0 && arr[row][col-1]==1 && !vis[row][col-1]){
                vis[row][col-1]=true;
                q.add(new Triplet(row,col-1,c+1));
            }
            if(row<n-1 && arr[row+1][col]==1 && !vis[row+1][col]){
                vis[row+1][col]=true;
                q.add(new Triplet(row+1,col,c+1));
            }
            if(col<m-1 && arr[row][col+1]==1 && !vis[row][col+1]){
                vis[row][col+1]=true;
                q.add(new Triplet(row,col+1,c+1));
            }
        }
        return c;
    }

}