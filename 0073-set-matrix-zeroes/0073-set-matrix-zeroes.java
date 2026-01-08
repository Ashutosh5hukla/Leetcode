class Solution {
    public void setZeroes(int[][] mat) {
        boolean fr=false;
        boolean fc=false;
        int m=mat.length;
        int n=mat[0].length;
        // row check
        for(int i=0;i<n;i++){
            if(mat[0][i]==0){
                fr=true;
                break;
            }
        }
        // col check
        for(int j=0;j<m;j++){
            if(mat[j][0]==0){
                fc=true;
                break;
            }
        }
        // exclude fr and fc
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                 if (mat[i][j] == 0) {
                    mat[i][0]=0;
                    mat[0][j]=0;
                }
            }
        }
        // set 0 based on above marking
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(mat[0][j]==0 || mat[i][0]==0)mat[i][j]=0;
            }
        }
        // now if fr or fc is true
        if(fr){
            for(int j=0;j<n;j++){
                mat[0][j]=0;
            }
        }
        if(fc){
            for(int i=0;i<m;i++){
                mat[i][0]=0;
            }
        }
    }
}