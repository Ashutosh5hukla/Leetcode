class Solution {
    public void oneShift(int[][] arr, int row, int col) {
        int last = arr[row - 1][col - 1];
        for (int i=0; i<row; i++) {
            for (int j=0; j<col; j++) {
                int temp = arr[i][j];
                arr[i][j] = last;
                last = temp;
            }
        }
    }
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        while (k > 0) {
            oneShift(grid, grid.length, grid[0].length);
            k--;
        }
        return (List)Arrays.asList(grid);
    }
}