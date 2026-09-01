class Solution {
    public boolean rotateString(String s, String g){
        if (s.length() != g.length()) return false;
        for(int i=0;i<s.length();i++){
            if(g.charAt(0)==s.charAt(i)){
                boolean flag=fn(s,g,i);
                if(flag)return true;
            }
        }
        return false;
    }
     public boolean fn(String s, String g, int idx) {
        int n = s.length();
        for (int j = 0; j < n; j++) {
            if (s.charAt((idx+j)%n) != g.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}