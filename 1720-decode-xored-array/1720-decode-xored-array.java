class Solution {
    public int[] decode(int[] en, int f) {
        
        int ans[]=new int[en.length+1];
        int xo=f;
        for(int i=0;i<en.length;i++){
            ans[i]=xo;
            xo=en[i]^xo;
        }
        ans[en.length]=xo;
        return ans; 

    }
}