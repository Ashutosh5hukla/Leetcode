class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> ans = new ArrayList<>();
        int rem = 0;
        for(int i = 0; i < nums.length; i++){
            rem = (rem * 2 + nums[i]) % 5;
            ans.add(rem == 0);
        }
        return ans;
    }
}
