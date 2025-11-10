class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            
            int y=target-nums[i];
            if(map.containsKey(y)){
                int arr[]=new int[2];
                arr[0]=i;
                arr[1]=map.get(y);
                return arr;
            }
            map.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}