public class addMatrix {
  
    public static void main(String[] args) {
        int A[][] = { { 1, 1, 1, 1 }, 
        { 2, 2, 2, 2 }, 
        { 3, 3, 3, 3 }, 
        { 4, 4, 4, 4 } }; 
    
    int B[][] = { { 1, 1, 1, 1 }, 
        { 2, 2, 2, 2 }, 
        { 3, 3, 3, 3 }, 
        { 4, 4, 4, 4 } }; 
    
    
        int C[][] = new int[4][4];
    
        for(int i= 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                C[i][j] = A[i][j] + B[i][j];
            }
        }


        
        for(int i= 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                System.out.print(C[i][j] + " "); 
            }
            System.out.println();
        }
    }


}
