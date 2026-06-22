class Solution {
    public int maxDistinct(String s) {
        int freq[]=new int[26];
        int ans=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            freq[(ch-'a')]=1;
        }
        for(int i=0;i<26;i++){
            if(freq[i]==1)ans++;
        }
        return ans;

    }
}