public class SpiralMatrix implements newInterfaceExample, newInterfaceExampleTwo{ 
    static void spiralPrint(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int top = 0, bottom = rows - 1, left = 0, right = cols - 1;
        int direction = 0; 
        
        while (top <= bottom && left <= right) {
            if (direction == 0) { 
                for (int i = left; i <= right; i++)
                    System.out.print(matrix[top][i] + " ");
                top++;
            } else if (direction == 1) { 
                for (int i = top; i <= bottom; i++)
                    System.out.print(matrix[i][right] + " ");
                right--;
            } else if (direction == 2) { 
                for (int i = right; i >= left; i--)
                    System.out.print(matrix[bottom][i] + " ");
                bottom--;
            } else if (direction == 3) { 
                for (int i = bottom; i >= top; i--)
                    System.out.print(matrix[i][left] + " ");
                left++;
            }
             
            direction = (direction + 1) % 4;
        }
    }

     static  public void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        System.out.println("Input Matrix:");
        printMatrix(matrix);

        System.out.println("\nSpiral Order:");
        spiralPrint(matrix);
    
    }
 
    static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    @Override
    public void newFun() {
    }

    @Override
    public void hello() {
        
    }

    @Override
    public void hellowTwo() {
        System.out.println(newInterfaceExampleTwo.a);
    }
}
