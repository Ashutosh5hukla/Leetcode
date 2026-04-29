class Solution {
    public int balancedStringSplit(String s) {
        int bal=0,cnt=0;
        for (char ch:s.toCharArray()) {
            if(ch=='R') {
                bal++;
            }else{
                bal--;
            }
            if(bal==0) {
                cnt++;
            }
        }
        return cnt;
    }
}