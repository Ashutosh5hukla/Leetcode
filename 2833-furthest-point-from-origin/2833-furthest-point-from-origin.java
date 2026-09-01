class Solution {
    public int furthestDistanceFromOrigin(String mv) {
        int lc=0;
        int rc=0;
        int dc=0;
        for(int i=0;i<mv.length();i++){
            if(mv.charAt(i)=='L')lc++;
            else if(mv.charAt(i)=='R')rc++;
            else dc++;
        }
        return Math.abs(rc-lc)+dc;
    }
}