class Solution {
    public boolean canAliceWin(int[] nums) {
        int ss=0;
        int ds=0;
        for(int ele: nums){
            if(ele<10)ss+=ele;
            else ds+=ele;
        }
        return ss!=ds;
    }
}