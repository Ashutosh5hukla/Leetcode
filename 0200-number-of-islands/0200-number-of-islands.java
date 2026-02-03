class Solution {
    public int numIslands(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        boolean vis[][]=new boolean[m][n];
        int c=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1' && !vis[i][j]){
                    bfs(grid,vis,i,j);
                    c++;
                }
            }
        }
        return c;
    }
    void bfs(char[][] grid,boolean[][] vis,int r,int c){
        int m=grid.length;
        int n=grid[0].length;
        int dir[][]={{0,-1},{0,1},{-1,0},{1,0}};
        Queue<int[]> q=new LinkedList<>();
        vis[r][c]=true;  
        q.add(new int[]{r,c});
        while(!q.isEmpty()){
            int arr[]=q.poll();
            for(int i=0;i<dir.length;i++){
                    int cr=arr[0]+dir[i][0];
                    int cc=arr[1]+dir[i][1];
                    if(cr>=0 && cc>=0 && cr<m && cc<n){
                        if(!vis[cr][cc] && grid[cr][cc]=='1'){
                            q.add(new int[]{cr,cc});
                            vis[cr][cc]=true;
                        }
                    }
            }
        }

    }
}