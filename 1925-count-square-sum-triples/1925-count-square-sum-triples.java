class Solution {
    public int countTriples(int n) {
        int cnt=0;
        for(int c=1;c<=n;c++){
            for(int a=1;a<c;a++){
                int b2=c*c -a*a;
                int b = (int)Math.sqrt(b2);            
                if (b <= n && b*b==b2) {
                    cnt++;
                }
            }
        }
        return cnt;
    }
}