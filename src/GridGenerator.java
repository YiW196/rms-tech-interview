import java.util.Random;

public class GridGenerator {
    //Create a nxm grid filled in with random integers (<100)
    public int[][] createGrid(int row, int col) {
        int[][] grid = new int[row][col];
        Random rand = new Random();
        int upperBound = 100;

        for (int r = 0; r < row; r++){
            for (int c = 0; c < col; c++){
                grid[r][c] = rand.nextInt(upperBound);
            }
        }
        return grid;
    }

}
