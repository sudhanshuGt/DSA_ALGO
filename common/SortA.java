public class SortA {
    public static void main(String[] args){
        int[] arr = {2, 3, 4, 1, 5, 6, 8, 7};

        System.out.println("Unsorted : ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+ " ");
        }

        System.out.println();
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length - i - 1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println("Sorted : ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
