class Solution {
    public int maxTotalFruits(int[][] arr, int startPos, int k) {
        int n=arr.length;
        int pos[]=new int[arr.length];
        for(int i=0;i<n;i++){
            pos[i]=arr[i][0];
        }
        int pre[]=new int[n];
        pre[0]=arr[0][1];
        for(int i=1;i<n;i++){
            pre[i]=pre[i-1]+arr[i][1];
        }
        int maxFrutis =0;
        for(int d=0;d<=k/2;d++){
            //case1-move to left
            int remain=k-2*d;
            int i=startPos-d;
            int j=startPos+remain;
            int left  = lowerBound(pos, i);
            int right = upperBound(pos, j) - 1;
            if (left <= right) {
                int total = pre[right]-(left>0?pre[left-1]:0);
                maxFrutis = Math.max(maxFrutis, total);
            }
            //case1-move to right
            remain = k-2*d;
            i=startPos-remain;
            j=startPos+d;
            left=lowerBound(pos,i);
            right=upperBound(pos,j) - 1;
            if (left <= right) {
                int total = pre[right] - (left > 0 ? pre[left - 1] : 0);
                maxFrutis = Math.max(maxFrutis, total);
            }
        }
        return maxFrutis;
    }
    private int lowerBound(int[] arr, int target) {
        int left = 0, right = arr.length;
        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
    private int upperBound(int[] arr, int target) {
        int left = 0, right = arr.length;
        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}