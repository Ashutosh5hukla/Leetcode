class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        k=k%mat[0].length;
        int temp[][]=new int[mat.length][mat[0].length];
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                temp[i][j]=mat[i][j];
            }
        }
        while(k-->0){
            for(int i=0;i<mat.length;i++){
                if(i%2==0)s1(temp,i);
                else s2(temp,i);
            }
        }
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j]!=temp[i][j])return false;
            }
        }
        return true;
    }
    void s1(int arr[][],int idx){
        int first=arr[idx][0];
        for(int j=0;j<arr[idx].length-1;j++)arr[idx][j]=arr[idx][j+1];
        arr[idx][arr[idx].length-1]=first;
    }

    void s2(int arr[][],int idx){
        int last=arr[idx][arr[idx].length-1];
        for(int j=arr[idx].length-1;j>0;j--)arr[idx][j]=arr[idx][j-1];
        arr[idx][0]=last;
    }
}