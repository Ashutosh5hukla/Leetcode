class Solution {
    private int[][] squares;

    public double separateSquares(int[][] squares) {
        this.squares = squares;

        double totalArea = 0;
        double right = 0;
        for (int[] square : squares) {
            totalArea += (1.0 * square[2] * square[2]);
            right = Math.max(right, square[1] + square[2]);
        }

        double left = 0;
        double buffer = 1e-5;

        while (Math.abs(right - left) > buffer) {
            double mid = (left + right) / 2;
            double lowerArea = findArea(mid);
            if (lowerArea * 2 >= totalArea) {
                right = mid;                
            } else {
                left = mid;
            }
        }

        return right;
    }

    private double findArea(double y) {
        double area = 0;
        for (int[] square : squares) {
            int y1 = square[1], y2 = square[1] + square[2];
            if (y > y2) {
                area += (1.0 * square[2] * square[2]);
            } else if (y1 < y && y <= y2) {
                area += (1.0 * (y - y1) * square[2]);
            }
        }

        return area;
    }
}