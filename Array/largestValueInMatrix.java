public class largestValueInMatrix {

    public static int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int[][] maxLocal = new int[n - 2][n - 2];
 
        for (int i = 0; i < n - 2; i++) {
            for (int j = 0; j < n - 2; j++) {
                int maxVal = Integer.MIN_VALUE;
                 
                for (int x = i; x < i + 3; x++) {
                    for (int y = j; y < j + 3; y++) {
                        maxVal = Math.max(maxVal, grid[x][y]);
                    }
                }
                 
                maxLocal[i][j] = maxVal;
            }
        }

        return maxLocal;
    }


    public static void main(String[] args) {
        int[][] grid = {{9,9,8,1},{5,6,2,6},{8,2,6,4},{6,2,2,2}};
        int[][] result = largestLocal(grid);

        for(int i = 0; i < result.length; i++){
            for(int j = 0; j < result[i].length; j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    
    }
}
