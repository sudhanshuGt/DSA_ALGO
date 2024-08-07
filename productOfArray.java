public class productOfArray {

    public static int[] productExceptSelf(int[] nums) {

      int n = nums.length;
      int[] answer = new int[n];
      
      answer[0] = 1; 
      for (int i = 1; i < n; i++) {
          answer[i] = nums[i - 1] * answer[i - 1];
      }

      int R = 1;
      for (int i = n - 1; i >= 0; i--) { 
          answer[i] = answer[i] * R; 
          R *= nums[i];
      }

      return answer;
  }


    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 4, 5};
        for(int arrr : arr){
            System.out.print(arrr + " ");
        }
        int[] res_ = new int[arr.length];
        res_ = productExceptSelf(arr);
        System.out.println();
        for(int arrr : res_){
            System.out.print(arrr + " ");
        }
    }
}
