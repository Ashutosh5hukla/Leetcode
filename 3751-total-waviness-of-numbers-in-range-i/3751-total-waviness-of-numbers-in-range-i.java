class Solution {
    public int totalWaviness(int num1, int num2) {
        int ans=0;
        for(int i=num1;i<=num2;i++){
            ans+=helper(i);
        }
        return ans;
    }
    int helper(int n){
        String s=n+"";
        int p=0;
        int v=0;
        for(int i=1;i<s.length()-1;i++){
            int v1=s.charAt(i-1)-'0';
            int v2=s.charAt(i)-'0';
            int v3=s.charAt(i+1)-'0';
            if(v2>v1 && v2>v3)p++;
            else if(v2<v1 && v2<v3)v++;
        }
        return v+p;
    }
}