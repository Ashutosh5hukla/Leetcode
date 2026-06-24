class Solution {
    public int[] minOperations(String boxes) {
        int n=boxes.length();
        int[] ans=new int[n];
        int balls=0,ops=0;
        for(int i=0;i<n;i++){
            if(boxes.charAt(i)=='1'){
                balls++;
                ops+=i;
            }
        }
        ans[0]=ops;
        int lb=boxes.charAt(0)-'0';
        int rb=balls-lb;
        for(int i=1;i<n;i++){
            ans[i]=ans[i-1]+lb-rb;
            if(boxes.charAt(i)=='1'){
                lb++;
                rb--;
            }
        }
        return ans;
    }
}