class Solution {
    public int minRemoval(int[] A, int k) {
        Arrays.sort(A);
        int i = 0;
        for (int a: A){
            if (a > 1L*A[i]*k)i++;
            }
        return i;
    }
}