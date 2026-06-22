class Solution {
    public boolean isStrictlyPalindromic(int n) {
        for(int b=2;b<=n-2;b++){
            String s=convert(n,b);
            String rev=new StringBuilder(s).reverse().toString();
            if(!s.equals(rev)) return false;
        }
        return true;
    }
    private String convert(int n,int base){
        StringBuilder sb=new StringBuilder();
        while(n>0){
            sb.append(n%base);
            n/=base;
        }
        return sb.reverse().toString();
    }
}