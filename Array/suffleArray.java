public class suffleArray {
    // this function works only when suffling array from middle
    public static int[] suffleArrays(int[] nums, int n){
        int[] suffleArr = new int[nums.length];
        int pointer = 0;
        int n_ = nums.length / 2;
        for(int i = 0; i < n_  ; i++){
            suffleArr[pointer] = nums[i];
            pointer++;
            suffleArr[pointer] = nums[n + i];
            pointer++; 
        }
        return suffleArr; 
    }

    public static void printArr(int[] nums){
        for(int i : nums){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,2};
        printArr(arr);
        int[] suffleArr = new int[arr.length];
        suffleArr = suffleArrays(arr, 2);
        printArr(suffleArr);

    }
}