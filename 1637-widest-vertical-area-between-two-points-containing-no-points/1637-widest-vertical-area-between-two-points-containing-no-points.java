class Solution {
    public int maxWidthOfVerticalArea(int[][] pts) {
        int arr[]=new int[pts.length];
        for(int i=0;i<arr.length;i++){
            arr[i]=pts[i][0];
        }
        Arrays.sort(arr);
        int ans=0;
        for(int i=1;i<arr.length;i++){
            ans=Math.max(ans,arr[i]-arr[i-1]);
        }
        return ans;
    }
}