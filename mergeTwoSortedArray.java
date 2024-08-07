import java.util.ArrayList;
import java.util.List;

public class mergeTwoSortedArray {
    public static void merge(int[] nums1, int[] nums2) {

        int m = nums1.length;
        int n = nums2.length;

        List<Integer> resultArr = new ArrayList<>();

        for(int i = 0; i < resultArr.size() ; i++){
            if(i < m) resultArr.add(nums1[i]);
            i++;
            if(i < n) resultArr.add(nums2[i]);
        }

          System.out.println(resultArr);
        
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};

        merge(nums1, nums2);
    }
}
