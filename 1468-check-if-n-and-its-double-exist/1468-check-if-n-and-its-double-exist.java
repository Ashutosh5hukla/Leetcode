import java.util.*;

class Solution {
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int target;
            if (arr[i] % 2 == 0) target = arr[i] / 2;
            else target = arr[i] * 2;

            boolean x = bs(arr, target, i);
            if (x) return true;
        }
        return false;
    }

    static boolean bs(int[] arr, int t, int idx) {
        int s = 0;
        int e = arr.length - 1;
        while (s <= e) {
            int m = s + (e - s) / 2;
            if (arr[m] == t && idx != m) {
                return true;
            }
            if (arr[m] > t) e = m - 1;
            else s = m + 1;
        }
        return false;
    }
}
