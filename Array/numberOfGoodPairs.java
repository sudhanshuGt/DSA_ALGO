public class numberOfGoodPairs {

    public static int goodPairs(int[] nums){
        int pairs = 0;

        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                if(i != j && i < j && nums[i] == nums[j]){
                    pairs++;
                }
            }
        }

        return pairs;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3};

        System.out.println(goodPairs(nums));
    }
}
