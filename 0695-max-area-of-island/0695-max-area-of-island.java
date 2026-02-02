class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        boolean vis[][]=new boolean[m][n];
        int mx=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1 && !vis[i][j]){
                    int a=bfs(grid,vis,i,j);
                    mx=Math.max(mx,a);
                }
            }
        }
        return mx;
    }
    int bfs(int[][] grid,boolean[][] vis,int i,int j){
        int area=0;
        int m=grid.length;
        int n=grid[0].length;
        Queue<int[]> q =new LinkedList<>();
        q.add(new int[]{i,j});
        vis[i][j]=true;
        int[][] dir={{0,1},{0,-1},{1,0},{-1,0}};
        while(!q.isEmpty()){
            int[] curr=q.poll();
            area++;
            int r=curr[0];
            int c=curr[1];
            for(int [] d : dir){
                int nr=r+d[0];
                int nc=c+d[1];
                if(nr>=0 && nr<m && nc>=0 && nc<n && grid[nr][nc]==1 && !vis[nr][nc]){
                    q.offer(new int[]{nr,nc});
                    vis[nr][nc]=true;
                }
            }
        }
        return area;

    }
}