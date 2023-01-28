import org.junit.Assert;
import org.junit.Test;

public class GridTest {
    private final int[][] grid = {{1,2,3},
                                    {4,5,6},
                                    {7,8,9}};
    private final int length = 3;
    private final ProductCalculator productCalculator = new ProductCalculator();
    private final GridGenerator gridGenerator = new GridGenerator();

   @Test
   public void given3x3Grid_whenLengthIs3_thenReturnCorrectProduct(){
       long actualProduct = productCalculator.findProduct(grid, length);
       long noOfCombination = productCalculator.getNoOfCombination();
       int expectedCombNum = 8;
       long expectedProduct = 504;
       Assert.assertEquals(expectedCombNum, noOfCombination);
       Assert.assertEquals(expectedProduct, actualProduct);
   }

    @Test
    public void given3x3Grid_whenLengthIs2_thenReturnCorrectProduct(){
        int length = 2;
        long actualProduct = productCalculator.findProduct(grid, length);
        long noOfCombination = productCalculator.getNoOfCombination();
        int expectedCombNum = 20;
        long expectedProduct = 72;
        Assert.assertEquals(expectedCombNum, noOfCombination);
        Assert.assertEquals(expectedProduct, actualProduct);
    }

    @Test
    public void given10x10Grid_whenLengthIs3_thenReturnCorrectNoOfComb(){
        int[][] newGrid = gridGenerator.createGrid(10, 10);
        productCalculator.findProduct(newGrid, length);
        long noOfCombination = productCalculator.getNoOfCombination();
        int expectedCombNum = 288;
        Assert.assertEquals(expectedCombNum, noOfCombination);
    }

    @Test
    public void given1000x1001Grid_whenLengthIs3_thenReturnCorrectNoOfComb(){
        int[][] newGrid = gridGenerator.createGrid(1000, 1001);
        productCalculator.findProduct(newGrid, length);
        long noOfCombination = productCalculator.getNoOfCombination();
        int expectedCombNum = 3992002;
        Assert.assertEquals(expectedCombNum, noOfCombination);
    }
}
