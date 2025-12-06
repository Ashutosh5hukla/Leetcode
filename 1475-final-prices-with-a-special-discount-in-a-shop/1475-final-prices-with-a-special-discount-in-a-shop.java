class Solution {
    public int[] finalPrices(int[] p) {
        Stack<Integer> st=new Stack<>();
        int ans[]=new int [p.length];
        for(int i=0;i<p.length;i++){
            int d=-1;
            for(int j=i+1;j<p.length;j++){
                if(p[i]>=p[j]){
                    d=p[i]-p[j];
                    break;
                }
            }
            ans[i]=d==-1?p[i]:d;
        }
        return ans;
    }
}