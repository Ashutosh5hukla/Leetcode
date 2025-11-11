class Solution {
    public int[] fairCandySwap(int[] as, int[] bs) {
        int asum=0;
        int bsum=0;
        for(int e : as)asum+=e;
        for(int e : bs)bsum+=e;
        Arrays.sort(bs);
        for(int i=0;i<as.length;i++){
            int y=(bsum-asum)/2 + as[i];
            int temp=binarySearch(bs,y);
            if(temp!=-1)return new int[]{as[i],bs[temp]};
        }
        return new int[]{0,0};
    }
    int binarySearch(int[] a, int b) {
        int l = 0, r = a.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (a[mid] == b)
                return mid;
            else if (a[mid] < b)
                l = mid + 1;
            else
                r = mid - 1;
        }
        return -1;
    }
} 