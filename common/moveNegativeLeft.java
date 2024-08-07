class moveNegativeLeft {
    public static void main(String[] args) {
        int[] arr  = { 2, 3, -1, -2, -5, -1, 9, 5, 1}; 
    
        printArr(arr);
        moveToLeft(arr);
        printArr(arr);
    
    }

    private static void printArr(int[] arr) {
        for(int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    private static void moveToLeft(int[] arr) {
        for(int i= 0 ; i < arr.length -1 ; i++){
            for(int j  = 0; j < arr.length - i - 1; j++){
                if (arr[j] > arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }
}