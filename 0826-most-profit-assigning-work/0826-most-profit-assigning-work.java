import java.util.*;

class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        ArrayList<int[]> list = new ArrayList<>();
        // (difficulty, profit)
        for (int i = 0; i < difficulty.length; i++) {
            list.add(new int[]{difficulty[i], profit[i]});
        }
        // sort by difficulty
        list.sort((a, b) -> a[0] - b[0]);
        // prefix max profit
        int mx = list.get(0)[1];
        for (int i = 1; i < list.size(); i++) {
            mx = Math.max(mx, list.get(i)[1]);
            list.get(i)[1] = mx;
        }
        int ans = 0;
        // for each worker → binary search
        for (int w : worker) {
            int idx = binarySearch(list, w);
            if (idx != -1) {
                ans += list.get(idx)[1];
            }
        }
        return ans;
    }
    // find last index where difficulty <= worker ability
    int binarySearch(ArrayList<int[]> list, int target) {
        int s = 0, e = list.size() - 1;
        int ans = -1;
        while (s <= e) {
            int m = s + (e - s) / 2;
            if (list.get(m)[0] <= target) {
                ans = m;
                s = m + 1;
            } else {
                e = m - 1;
            }
        }
        return ans;
    }
}