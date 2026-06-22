class Solution {
    public int mirrorDistance(int n) {
        StringBuilder sb=new StringBuilder(n+"");
        sb.reverse();
        int rn=Integer.parseInt(sb.toString());
        return Math.abs(rn-n);
    }
}