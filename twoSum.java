import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class twoSum {

    // two pointer algorithm to find triplet which sum = 0 in O(n)
    public static List<List<Integer>> findTriplets(int[] nums){
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int total = nums[i] + nums[left] + nums[right];
                if (total == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;
                    left++;
                    right--;
                } else if (total < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return result;
    }
  

    public static void main(String[] args) {
        int[] arr = {-2,0,1,1,2};
        System.out.println(findTriplets(arr));
    }
}
