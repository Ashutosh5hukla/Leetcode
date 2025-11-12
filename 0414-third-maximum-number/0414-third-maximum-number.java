class Solution {
    public int thirdMax(int[] arr) {
        long f = Long.MIN_VALUE, s = Long.MIN_VALUE, t = Long.MIN_VALUE;
        for (int n : arr) {
            if (n == f || n == s || n == t) continue;
            if (n > f) {
                t = s;
                s = f;
                f = n;
            } else if (n > s) {
                t = s;
                s = n;
            } else if (n > t) {
                t = n;
            }
        }
        return (t == Long.MIN_VALUE) ? (int) f : (int) t;
    }
}
