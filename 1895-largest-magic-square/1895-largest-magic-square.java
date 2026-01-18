class Solution {

    public int largestMagicSquare(int[][] mat) {
        int R = mat.length;
        int C = mat[0].length;

        int[][] rowSum = new int[R][C];
        for (int r = 0; r < R; r++) {
            rowSum[r][0] = mat[r][0];
            for (int c = 1; c < C; c++) {
                rowSum[r][c] = rowSum[r][c - 1] + mat[r][c];
            }
        }

        int[][] colSum = new int[R][C];
        for (int c = 0; c < C; c++) {
            colSum[0][c] = mat[0][c];
            for (int r = 1; r < R; r++) {
                colSum[r][c] = colSum[r - 1][c] + mat[r][c];
            }
        }

        int maxSize = 1;

        for (int r = 0; r < R; r++) {
            for (int c = 0; c < C; c++) {
                int maxPossible = Math.min(R - r, C - c);

                for (int size = maxPossible; size > maxSize; size--) {
                    if (isMagic(r, c, size, mat, rowSum, colSum)) {
                        maxSize = size;
                        break;
                    }
                }
            }
        }
        return maxSize;
    }

    private boolean isMagic(
            int sr, int sc, int size,
            int[][] mat, int[][] rowSum, int[][] colSum) {

        int target = rowSum[sr][sc + size - 1]
                   - (sc > 0 ? rowSum[sr][sc - 1] : 0);

        for (int r = sr; r < sr + size; r++) {
            int sum = rowSum[r][sc + size - 1]
                    - (sc > 0 ? rowSum[r][sc - 1] : 0);
            if (sum != target) return false;
        }

        for (int c = sc; c < sc + size; c++) {
            int sum = colSum[sr + size - 1][c]
                    - (sr > 0 ? colSum[sr - 1][c] : 0);
            if (sum != target) return false;
        }

        int d1 = 0;
        for (int k = 0; k < size; k++)
            d1 += mat[sr + k][sc + k];
        if (d1 != target) return false;

        int d2 = 0;
        for (int k = 0; k < size; k++)
            d2 += mat[sr + size - 1 - k][sc + k];

        return d2 == target;
    }
}