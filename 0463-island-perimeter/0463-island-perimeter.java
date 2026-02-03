class Solution {
    public int islandPerimeter(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        boolean vis[][]=new boolean[m][n];
        int ans=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    return bfs(grid,vis,i,j);
                }
            }
        }
        return 0;
    }
    int bfs(int[][]grid,boolean[][] vis,int r,int c){
        int m=grid.length;
        int n=grid[0].length;
        int ans=0;
        vis[r][c]=true;
        Queue<int[]> q=new LinkedList<>();
        q.add(new int[]{r,c});
        while(!q.isEmpty()){
            int a=4;
            int arr[]=q.poll();
            int row=arr[0];
            int col=arr[1];
            if(row>0 && grid[row-1][col]==1){
                a--;
                if(!vis[row-1][col]){
                    q.add(new int[]{row-1,col});
                    vis[row-1][col]=true;
                }
            }
            if(row<m-1 && grid[row+1][col]==1){
                a--;
                if(!vis[row+1][col]){
                    q.add(new int[]{row+1,col});
                    vis[row+1][col]=true;
                }
            }
            if(col>0 && grid[row][col-1]==1){
                a--;
                if(!vis[row][col-1]){
                    q.add(new int[]{row,col-1});
                    vis[row][col-1]=true;
                }
            }
            if(col<n-1 && grid[row][col+1]==1){
                a--;
                if(!vis[row][col+1]){
                    q.add(new int[]{row,col+1});
                    vis[row][col+1]=true;
                }
            }
            ans+=a;
        }
        return ans;
    }
}