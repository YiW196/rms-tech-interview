public class Main {
    public static void main(String[] args) {
        //Generate a nxm grid with random numbers less than 100
        GridGenerator gridGenerator = new GridGenerator();
        int[][] newGrid = gridGenerator.createGrid(10, 10);

        int length = 3;
        ProductCalculator productCalculator = new ProductCalculator();
        long maxProduct = productCalculator.findProduct(newGrid, length);
        long noOfCombination = productCalculator.getNoOfCombination();

        System.out.println("The greatest product of " + length +
                " adjacent numbers in the same direction is " + maxProduct);

        System.out.println("There are " + noOfCombination + " different combination");
    }
}

