class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int[] res=new int[nums.size()];
        int k=0;
        for(int x:nums){
            if(x==2){
                res[k++]=-1;
                continue;
            }
            int best=x;
            for(int i=0;i<32;i++){
                if(((x-(1<<i))|((x-(1<<i))+1))==x){
                    best=Math.min(x-(1<<i),best);
                }
            }
            res[k++]=best;
        }
        return res;
    }
}