class Solution {
    public int maxNumberOfBalloons(String text) {
        int freq[]=new int[27];
        for(int i=0;i<text.length();i++){
            char ch=text.charAt(i);
            freq[ch-'a']++;
        }
        int b=freq[1];
        int a=freq[0];
        int l=freq[11]<=1?0:freq[11]/2;
        int o=freq[14]<=1?0:freq[14]/2;
        int n=freq[13];
        return Math.min(b,Math.min(a,Math.min(l,Math.min(o,n))));
    }
}