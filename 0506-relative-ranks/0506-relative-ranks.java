class Solution {
    public String[] findRelativeRanks(int[] arr) {
        int n = arr.length;
        int brr[] = new int[n];
        for (int i=0;i<n;i++) brr[i]=arr[i];
        Arrays.sort(brr);

        HashMap<Integer, String> map = new HashMap<>();

        for (int i=n-1;i>= 0;i--){
            int r=n-i;
            if(r==1)map.put(brr[i],"Gold Medal");
            else if(r==2)map.put(brr[i],"Silver Medal");
            else if(r==3)map.put(brr[i],"Bronze Medal");
            else map.put(brr[i], String.valueOf(r));
        }
        String ans[] = new String[n];
        for (int i = 0; i < n; i++) {
            ans[i] = map.get(arr[i]);
        }
        return ans;
    }
}
