class Solution {
    public int[] countPoints(int[][] p, int[][] q) {
        int arr[]=new int[q.length];
        for(int i=0;i<q.length;i++){
            int r=q[i][2];
            int a=q[i][0];
            int b=q[i][1];
            for(int j=0;j<p.length;j++){
                int x=p[j][0];
                int y=p[j][1];
                // if(x>=a-r && y>=b-r && x<=a+r && y<=b+r)arr[i]++;
                int dx=x-a;
                int dy=y-b;
                if(dx*dx + dy*dy<=r*r)arr[i]++;
            }
        }
        return arr;
    }
}