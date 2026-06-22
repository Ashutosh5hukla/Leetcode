class Solution {
    public int[] findDegrees(int[][] mat) {
        int ans[]=new int[mat.length];
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j]==1)ans[i]++;
            }
        }
        return ans;
    }
}