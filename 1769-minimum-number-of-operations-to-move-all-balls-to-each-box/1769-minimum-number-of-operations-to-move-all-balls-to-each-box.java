class Solution {
    public int[] minOperations(String bx) {
        int ans[]=new int[bx.length()];
        for(int i=0;i<bx.length();i++){
            for(int j=0;j<bx.length();j++){
                if(bx.charAt(j)=='1')ans[i]+=Math.abs(i-j);
            }
        }
        return ans;
    }
}