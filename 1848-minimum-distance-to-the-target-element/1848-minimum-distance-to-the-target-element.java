class Solution {
    public int getMinDistance(int[] nums, int t, int s) {
        // 1  2 3 5 2 4 8 7 5 2 1 5 5 1 3 2 //t=5,s=6
        int i=s;
        int j=s;
        while(i>=0  || j<nums.length){
            if(i>=0 && nums[i]==t)return Math.abs(i-s);
            if(j<nums.length && nums[j]==t)return Math.abs(j-s);
            i--;
            j++;
        }
        return 0;
    }
}