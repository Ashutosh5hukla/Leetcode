class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n = nums.length;
        int even = 0, odd = 1;

        while (even < n && odd < n) {
            if (nums[even] % 2 == 1) {
                while (odd < n && nums[odd] % 2 == 1) {
                    odd += 2;
                }
                int temp = nums[even];
                nums[even] = nums[odd];
                nums[odd] = temp;
            }
            even += 2;
        }

        return nums;
    }
}
