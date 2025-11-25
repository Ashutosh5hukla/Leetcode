class Solution {
    public int[][] flipAndInvertImage(int[][] mat) {
        for(int[] arr : mat){
            rev(arr);
            inv(arr);
        }
        return mat;
    }
    void rev(int[] arr){
        int i=0,j=arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;j--;
        }
    }
    void inv(int[] arr){
        for(int i = 0; i < arr.length; i++)arr[i] = arr[i] == 0 ? 1 : 0;
    }
}
