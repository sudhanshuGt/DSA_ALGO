public class mergeSort {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 1, 9 , 7, 8 , 10, 6};

        printArr(arr);

        mergeSortAlgo(arr, 0, arr.length -1 );

        printArr(arr);
    }

    private static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private static void mergeSortAlgo(int[] arr, int left, int right) {
        if (left < right ) {
            int mid = left +  ( right - left  ) / 2;

            mergeSortAlgo(arr, left, mid);
            mergeSortAlgo(arr, mid + 1, right);
            mergeArr(arr, left, right, mid);
        }
    }

    private static void mergeArr(int[] arr, int left, int right, int mid) {
         int n1 = mid - left + 1;
         int n2 = right - mid;


         int[] L = new int[n1];
         int[] R = new int[n2];

         int i = 0, j = 0;
         int k = left;

         while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
    
       
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
   
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }


    }
}
