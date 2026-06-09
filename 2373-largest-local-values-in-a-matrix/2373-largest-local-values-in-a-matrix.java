class Solution {
    public int[][] largestLocal(int[][] mat) {
        int n=mat.length;
        int ans[][]=new int[n-2][n-2];
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans.length;j++){
                ans[i][j]=mx(mat,i+1,j+1);
            }
        }
        return ans;
    }
    int mx(int mat[][],int i,int j){
        PriorityQueue<Integer> hp = new PriorityQueue<>(Collections.reverseOrder());
        hp.add(mat[i][j]);
        hp.add(mat[i+1][j]);
        hp.add(mat[i][j+1]);
        hp.add(mat[i-1][j]);
        hp.add(mat[i][j-1]);
        hp.add(mat[i+1][j+1]);
        hp.add(mat[i-1][j-1]);
        hp.add(mat[i-1][j+1]);
        hp.add(mat[i+1][j-1]);
        return hp.peek();
    }
}