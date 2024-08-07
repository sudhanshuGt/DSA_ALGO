import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class nextPermutation {

    public static int[] nextGreaterPermutation(int[] nums){
        Scanner sc = new Scanner(System.in);
        int ind = -1; 
        int n = nums.size();
        for(int i  = n - 2; i>= 0; i--){
            if (nums.get(i) < nums.get(i+1)) {
                ind = i;
                break;
            }
        }
        if (ind == -1) {
            Collections.reverse(nums);
            return nums;
        }

        for(int i= n-1; i > ind; i--){
            if (nums.get(i) > nums.get(ind)) {
                Collections.swap(nums, i, ind);
                break;
            }
        }

    
        return nums;
    }

    public static void main(String[] args) {

        int[] list = {3, 2, 1};
        System.out.println(nextGreaterPermutation(list));
    }
}
