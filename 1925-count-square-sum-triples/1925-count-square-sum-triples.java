class Solution {
    public int countTriples(int n) {
        int cnt=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==j)continue;
                int c2=i*i + j*j;
                int c = (int)Math.sqrt(c2);            
                if (c <= n && c*c== c2) {
                    cnt++;
                }
            }
        }
        return cnt;
    }
}