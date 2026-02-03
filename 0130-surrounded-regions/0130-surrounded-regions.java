class Solution {
    public void solve(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        boolean vis[][]=new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 || j==0 || i==m-1 || j==n-1){
                    if(grid[i][j]=='O' && !vis[i][j]){
                        bfs(grid,vis,i,j);
                    }
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='O' && !vis[i][j])grid[i][j]='X';
            }
        }
    }
    void bfs(char[][] grid,boolean[][] vis, int r,int c){
        int m=grid.length;
        int n=grid[0].length;
        vis[r][c]=true;
        Queue<int[]> q=new LinkedList<>();
        q.add(new int[]{r,c});
        while(!q.isEmpty()){
            int[]arr=q.poll();
            int row=arr[0];
            int col=arr[1];
            if(row>0 && grid[row-1][col]=='O' && !vis[row-1][col]){
                q.add(new int[]{row-1,col});
                vis[row-1][col]=true;
            }
            if(row<m-1 && grid[row+1][col]=='O' && !vis[row+1][col]){
                q.add(new int[]{row+1,col});
                vis[row+1][col]=true;
            }
            if(col>0 && grid[row][col-1]=='O' && !vis[row][col-1]){
                q.add(new int[]{row,col-1});
                vis[row][col-1]=true;
            }
            if(col<n-1 && grid[row][col+1]=='O' && !vis[row][col+1]){
                q.add(new int[]{row,col+1});
                vis[row][col+1]=true;
            }
        }

    }
}