public class ProductCalculator {
    private long maxProd = 0;
    private long noOfCombination = 0;

    public long getNoOfCombination() {
        return noOfCombination;
    }

    public long findProduct(int[][] grid, int length){
        int n = grid.length;
        int m = grid[0].length;

        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                if (j < m - length + 1){
                    maxProd = getLatestMaxProd(grid, length, i, j, "row");
                }
                if (i < n - length + 1){
                    maxProd = getLatestMaxProd(grid, length, i, j, "col");
                }
                if (i + length - 1< n && j + length -1 < m ) {
                    maxProd = getLatestMaxProd(grid, length, i, j, "dia");
                }
                if (i >= length - 1 && j + length -1 < m ) {
                    maxProd = getLatestMaxProd(grid, length, i, j, "dia_backwards");
                }
            }
        }

        return maxProd;
    }

    private long getLatestMaxProd(int[][] grid, int length, int row, int col, String position) {
        long product = 1;
        for (int k = 0; k < length; k++) {
            if (position.equalsIgnoreCase("row")){
                product *= grid[row][col + k];
            } else if (position.equalsIgnoreCase("col")){
                product *= grid[row + k][col];
            } else if (position.equalsIgnoreCase("dia")){
                product *= grid[row + k][col + k];
            }else if (position.equalsIgnoreCase("dia_backwards")){
                product *= grid[row - k][col + k];
            }
        }
        noOfCombination += 1;
        maxProd = Math.max(maxProd, product);
        return maxProd;
    }
}
