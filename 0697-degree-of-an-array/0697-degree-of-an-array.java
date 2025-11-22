class Solution {
    public int findShortestSubArray(int[] arr) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        int maxFreq = 0;
        for(int x : arr){
            freq.put(x, freq.getOrDefault(x, 0) + 1);
            maxFreq = Math.max(maxFreq, freq.get(x));
        }
        int ans = arr.length;
        for(int key : freq.keySet()){
            if(freq.get(key) == maxFreq){

                int l = 0;
                while(l < arr.length && arr[l] != key) l++;

                int r = l + 1;
                int f = maxFreq - 1;
                while(r < arr.length && f != 0){
                    if(arr[r] == key) f--;
                    r++;
                }
                ans = Math.min(ans, r - l);
            }
        }

        return ans;
    }
}
