class Solution {
    public int minCapability(int[] arr, int k) {
        int s = min(arr);
        int e = mx(arr);
        int res = e;

        while (s <= e) {
            int m = s + (e - s) / 2;

            if (check(arr, k, m)) {
                res = m;
                e = m - 1;
            } else {
                s = m + 1;
            }
        }
        return res;
    }

    boolean check(int[] arr, int k, int m) {
        int housecnt = 0;
        int i = 0;

        while (i < arr.length) {
            if (arr[i] <= m) {
                housecnt++;
                i += 2;
            } else {
                i++;
            }
        }
        return housecnt >= k;
    }

    int min(int[] arr) {
        int mn = Integer.MAX_VALUE;
        for (int x : arr) mn = Math.min(mn, x);
        return mn;
    }

    int mx(int[] arr) {
        int mx = Integer.MIN_VALUE;
        for (int x : arr) mx = Math.max(mx, x);
        return mx;
    }
}