class Solution {
    public int maxWidthOfVerticalArea(int[][] pts) {
        // Arrays.sort((pts)->Integer.compare(a[0],b[0]));
        Arrays.sort(pts,(a,b)->Integer.compare(a[0],b[0]));
        int ans=0;
        for(int i=1;i<pts.length;i++){
            ans=Math.max(ans,pts[i][0]-pts[i-1][0]);
        }
        return ans;
    }
}