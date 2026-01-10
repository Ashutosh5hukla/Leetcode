class Solution {
    public boolean searchMatrix(int[][] mat, int t) {
        int r=mat.length;
        int c=mat[0].length;
        int s=0;
        int e=r-1;
        int arr=-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(t>=mat[m][0] && t<=mat[m][c-1]){
                    arr=m;
                    break;
            }else if(mat[m][0]>t){
                e=m-1;
            }else{
                s=m+1;
            }
        }
        if(arr==-1)return false;
        return bs(mat[arr],t);
    }
    private boolean bs(int[] arr, int t) {
        int l = 0, h = arr.length - 1;

        while (l <= h) {
            int m = l + (h - l) / 2;
            if (arr[m] == t) return true;
            else if (arr[m] < t) l = m + 1;
            else h = m - 1;
        }
        return false;
    }
}