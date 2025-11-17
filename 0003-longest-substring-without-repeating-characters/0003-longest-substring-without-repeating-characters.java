class Solution {
    public int lengthOfLongestSubstring(String s) {
        int res=0;
        int l=0,r=0;
        int[] freq=new int[128];
        while(r<s.length()) {
            char ch=s.charAt(r);
            freq[ch]++;
            while(freq[ch]>1) {
                freq[s.charAt(l)]--;
                l++;
            }
            res=Math.max(res,r-l+1);
            r++;
        }
        return res;
    }
}