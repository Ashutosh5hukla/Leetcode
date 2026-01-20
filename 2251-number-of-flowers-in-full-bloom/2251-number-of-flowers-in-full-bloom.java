class Solution {
    public int[] fullBloomFlowers(int[][] fl, int[] pe) {

        int n = fl.length;
        int[] st = new int[n];
        int[] end = new int[n];

        for (int i = 0; i < n; i++) {
            st[i] = fl[i][0];
            end[i] = fl[i][1];
        }

        Arrays.sort(st);
        Arrays.sort(end);

        int[] ans = new int[pe.length];
        for (int i = 0; i < pe.length; i++) {
            ans[i] = ub(st, pe[i]) - lb(end, pe[i]);
        }
        return ans;
    }
    int ub(int[] arr, int t) {
        int s = 0, e = arr.length - 1;
        int ans = -1;

        while (s <= e) {
            int m = s + (e - s) / 2;
            if (arr[m] <= t) {
                ans = m;
                s = m + 1;
            } else {
                e = m - 1;
            }
        }
        return ans+1;
    }
    int lb(int[] arr, int t) {
        int s = 0, e = arr.length - 1;
        int ans = arr.length;

        while (s <= e) {
            int m = s + (e - s) / 2;
            if (arr[m] >= t) {
                ans = m;
                e = m - 1;
            } else {
                s = m + 1;
            }
        }
        return ans;
    }
}
