class Solution {
    public int maxDistance(int[] c) {
        int i=0,j=c.length-1;
        int m1=0,m2=0;
        while(i<j){
            if(c[i]!=c[j]){
                 m1=Math.abs(i-j);
                 break;
            }
            j--;
        }
        i=0;
        j=c.length-1;
        while(j>i){
            if(c[i]!=c[j]){
                m2=Math.abs(i-j);
                break;
            }
            i++;
        }
        return Math.max(m1,m2);
    }
}
