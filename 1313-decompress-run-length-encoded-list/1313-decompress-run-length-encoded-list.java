class Solution {
    public int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> ls=new ArrayList<>();
        for(int i=0;i<nums.length-1;i+=2){
            int freq=nums[i];
            int ele=nums[i+1];
            while(freq-->0)ls.add(ele);
        }
        int ans[]=new int[ls.size()];
        for(int i=0;i<ans.length;i++){
            ans[i]=ls.get(i);
        }
        return ans;
    }
}