class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int m=matrix[0].length;

        for(int i=0;i<matrix.length;i++){
            int index=i;
            int end=m-1;
            if(matrix[i][0]<=target &&matrix[i][m-1]>=target){
                
             if(binarySearch(matrix[i],target,0,end)){
                return true;

              }else{
                continue;
        
              }
            }

        }
        return false;
        
    }
    public boolean binarySearch(int []matrix,int target,int start,int end){

        while(start<=end){
            int mid=start+(end-start)/2;
            if(matrix[mid]==target){
                return true;
            }
            else if(matrix[mid]>target){
                end=mid-1;
            }else{
                start=mid+1;
            }

        }
        return false;
    }
}