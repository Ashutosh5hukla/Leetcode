class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
         ArrayList<Integer> l=new ArrayList<>();
         int maxrow=arr.length-1;
        int maxcol=arr[0].length-1;
        int minrow=0;
        int mincol=0;
       while(minrow<=maxrow && mincol<=maxcol){
           // A-part (left to write)
           for(int j=mincol;j<=maxcol;j++){
               l.add(arr[minrow][j]);
           }minrow++;

           //B-part(up to down)
           if(minrow>maxrow || mincol>maxcol)break;
           for(int i=minrow;i<=maxrow;i++){
               l.add(arr[i][maxcol]);
           }maxcol--;

           //c-part(right to left)
           if(minrow>maxrow || mincol>maxcol)break;
           for(int j=maxcol;j>=mincol;j--){
               l.add(arr[maxrow][j]);
           }maxrow--;

           //D-part(down to up)
           if(minrow>maxrow || mincol>maxcol)break;
           for(int i=maxrow;i>=minrow;i--){
               l.add(arr[i][mincol]);
           }mincol++;
       }
       return l;
    }
}