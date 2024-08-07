import java.util.Random;

class selectionSort {

     public static void selectionSortAlgo(int[] arr){

        for(int i = 0 ; i < arr.length; i++){
            int min_idx = i;
            for(int j = i + 1; j < arr.length; j++)
                 if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                 }

            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;     
        }
     }

     public static void printArr(int[] arr){
         for(int i = 0 ; i < arr.length; i++){
            System.out.printf("%d ", arr[i]);
         }
         System.out.println("--Divider--");
     }

     public static void main(String[] args){
        
           int[] arr = new int[100];

           for(int i =0 ; i < arr.length; i++){
                arr[i] = new Random().nextInt();
           }

           printArr(arr);

           selectionSortAlgo(arr);

           printArr(arr);
   
      }
}