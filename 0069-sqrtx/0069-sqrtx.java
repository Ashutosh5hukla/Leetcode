class Solution {
    public int mySqrt(int x) {
        long s=0;
        long e=x;
        while(s<=e){
            long m=s+(e-s)/2;
            if(m*m==x) return (int)m;
            else if(m*m>(long)x)e=m-1;
            else s=m+1;
        }
        return (int)e;
    }
}