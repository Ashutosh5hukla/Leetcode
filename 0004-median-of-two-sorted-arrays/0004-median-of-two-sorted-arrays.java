class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length>nums2.length){
            return findMedianSortedArrays(nums2,nums1);
        }
        int l1=nums1.length;
        int l2=nums2.length;
        int s=0;
        int e=l1;
        while(s<=e){
            int px=s+(e-s)/2;//ele of nums1 in left box
            int py=(l1+l2+1)/2-px;//ele of nums2 in left box
            int x1=(px-1>=0)?nums1[px-1]:Integer.MIN_VALUE;
            int x2=(py-1>=0)?nums2[py-1]:Integer.MIN_VALUE;
            int x3=(px<l1)?nums1[px]:Integer.MAX_VALUE;
            int x4=(py<l2)?nums2[py]:Integer.MAX_VALUE;
            if(x1<=x4 && x2<=x3){
                if((l1+l2)%2==0)return (Math.max(x1,x2)+Math.min(x3,x4))/2.0;
                else return Math.max(x1,x2);
            }
            if(x1>x4)e=px-1;
            else s=px+1;
        }
        return 0;
    }
}