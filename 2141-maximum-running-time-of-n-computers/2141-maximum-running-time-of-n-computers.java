class Solution {
    public long maxRunTime(int n, int[] arr) {

        long sum = 0;
        int min = Integer.MAX_VALUE;

        for (int ele : arr) {
            min = Math.min(min, ele);
            sum += ele;
        }

        long s = 0;
        long e = sum / n;
        long ans = 0;

        while (s <= e) {
            long m = s + (e - s) / 2;

            long have = 0;
            long need = m * n;

            for (int ele : arr) {
                have += Math.min(ele, m);
            }

            if (have >= need) {
                ans = m;
                s = m + 1;
            } else {
                e = m - 1;
            }
        }
        return ans;
    }
}
