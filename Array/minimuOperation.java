public class minimuOperation {

    public static int minimuOperationFunc(int[] nums){
        int count = 0;

        for(int i = 0; i < nums.length; i++){
            if((nums[i] - 1) % 3 == 0 || (nums[i] + 1 ) % 3 == 0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(minimuOperationFunc(nums));
    }
}
