class Solution {
    class Pair{
        int val,idx;
        Pair(int val,int idx){
            this.val=val;
            this.idx=idx;
        }
    }
    public int[] getFinalState(int[] nums, int k, int mul) {
        PriorityQueue<Pair> hp=new PriorityQueue<>((a,b) -> a.val == b.val
        ? Integer.compare(a.idx, b.idx) : Integer.compare(a.val, b.val));
        for(int i=0;i<nums.length;i++){
            hp.add(new Pair(nums[i],i));
        }
        while(k-->0){
            Pair p=hp.poll();
            int v=p.val;
            v*=mul;
            hp.add(new Pair(v,p.idx));
        }
        int ans[]=new int[nums.length];
        while(!hp.isEmpty()){
            Pair p=hp.poll();
            ans[p.idx]=p.val;
        }
        return ans;

    }
}