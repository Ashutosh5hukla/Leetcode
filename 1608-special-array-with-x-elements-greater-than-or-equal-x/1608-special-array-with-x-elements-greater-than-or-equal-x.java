class Solution {
    public int specialArray(int[] nums) {
        int n = nums.length;
        int[] freq=new int[n+1];
        for (int ele : nums) {
            if (ele >= n)freq[n]++;
            else freq[ele]++;
        }
        int[] cs=new int[n+1];// cumulative sum
        cs[n]=freq[n];
        for(int i=n-1;i>=0;i--) {
            cs[i]=cs[i+1]+freq[i];
        }
        for(int i=0;i<=n;i++) {
            if(cs[i]==i)return i;
        }
        return -1;
    }
}