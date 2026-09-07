class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        boolean[] freq = new boolean[101];
        int min=101;
        int max=0;

        for(int x : nums) {
            freq[x] = true;
            min=Math.min(min,x);
            max=Math.max(max,x);
        }
        List<Integer> ans = new ArrayList<>();
        for(int i=min;i<=max;i++) {
            if(!freq[i])ans.add(i);
        }
        return ans;
    }
}