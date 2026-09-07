class Solution {
    public long sumAndMultiply(int n) {
        if(n==0)return 0;
        String str=n+"";
        long sum=0;
        String temp="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch!='0')temp+=ch;
            sum+=(ch-'0');
        }
        int x=Integer.parseInt(temp);
        return x*sum;
    }
}