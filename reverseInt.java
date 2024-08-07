import java.util.Arrays; 

public class reverseInt {
    public static void main(String[] args) {
        int[] arr = {7,10, 4, 3, 20, 15};
        printArr(arr);
        int s_ = kThSmallestNumber(arr,5);
        System.out.println("kth sm = "+ s_);

    }

    public static int kThSmallestNumber(int[] arr, int k ){
        
        Arrays.sortft(arr); 
        int n = arr.length ;
        return arr[n - k];
    }

    public static Integer searchAlgo(int[] arr, int t) {
        int l = 0;
        int r = arr.length - 1;
    
        while (l <= r) {
            int mid = l + (r - l) / 2;
    
            if (arr[mid] == t) {
                return mid;
            }
    
            if (arr[mid] < t) {
                l = mid + 1;
            } else {  
                r = mid - 1;
            }
        }
    
        return -1;
    }
    

    private static void findMaxMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i = 0 ; i < arr.length; i++){
            if (min > arr[i]) {
                min = arr[i];
            }
            if (max < arr[i] ) {
                max = arr[i];
            }
        }


        System.out.println("max = " + max + " min = " + min);
    }

    public static void sortArray(int[] arr){
        for(int i = 0 ; i < arr.length - 1; i++){
            for(int j = 0; j < arr.length - i - 1; j++){
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }


    public static void reverseArr(int[] arr){
        int l = 0;
        int r = arr.length - 1 ;

        while (l <= r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            r--;
            l++;
        }
    }

    public static void printArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
