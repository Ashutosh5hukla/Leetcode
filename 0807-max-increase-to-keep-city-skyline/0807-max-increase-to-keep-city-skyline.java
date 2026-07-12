class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int rh[]=new int[grid.length];
        int ch[]=new int[grid[0].length];
        maxr(grid,rh);
        maxc(grid,ch);
        int ans=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++) {
                ans +=Math.min(rh[i],ch[j])-grid[i][j];
            }
        }
        return ans;
    }
    void maxr(int[][] grid,int[] rh) {
        for(int i=0;i<grid.length;i++){
            int max=grid[i][0];
            for(int j=1;j<grid[0].length;j++) {
                max=Math.max(max,grid[i][j]);
            }
            rh[i]=max;
        }
    }
    void maxc(int[][] grid, int[] ch) {
        for(int j=0;j<grid[0].length;j++){
            int max=grid[0][j];
            for(int i=1;i<grid.length;i++){
                max=Math.max(max, grid[i][j]);
            }
            ch[j]=max;
        }
    }   
}