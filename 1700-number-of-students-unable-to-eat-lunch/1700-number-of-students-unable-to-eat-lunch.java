class Solution {
    public int countStudents(int[] s, int[] l) {
        int n = s.length;
        boolean[] eaten = new boolean[n];
        int i = 0;
        int j = 0;
        int count = 0;
        while (j < n && count < n) {
            if (!eaten[i] && s[i] == l[j]) {
                eaten[i] = true;
                j++;
                count = 0;
            } else {
                count++;
            }
            i=(i+1)%n;
        }
        return n-j;
    }
}
