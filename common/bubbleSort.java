class bubbleSort {

    public static void bubbleSortAlgo(int[] arr){

        for(int i= 0; i < arr.length - 1; i++){ 
            for(int j = 0; j < arr.length - i - 1; j++){ 
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp; 
                }
            }
        }
    }

    public static void printArr(int[] arr){
        for(int i = 0 ; i < arr.length; i++){
           System.out.printf("%d ", arr[i]);
        }
        System.out.println();
    }


    public static void main(String[] args) {
         int[] arr = {2, 3, 5, 6, 7, 1, 10};

           printArr(arr);

           bubbleSortAlgo(arr);

           printArr(arr);
    }

}