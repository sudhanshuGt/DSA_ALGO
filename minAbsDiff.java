import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class minAbsDiff {

    public static List<int[]> findPairsWithMinimumDifference(List<Integer> arr) {
        // Sort the array
        Collections.sort(arr);

        int minDifference = Integer.MAX_VALUE;
        List<int[]> result = new ArrayList<>();

        // First pass: find the minimum difference
        for (int i = 0; i < arr.size() - 1; i++) {
            int difference = Math.abs(arr.get(i) - arr.get(i + 1));
            if (difference < minDifference) {
                minDifference = difference;
            }
        }

        // Second pass: find all pairs with the minimum difference
        for (int i = 0; i < arr.size() - 1; i++) {
            int difference = Math.abs(arr.get(i) - arr.get(i + 1));
            if (difference == minDifference) {
                result.add(new int[]{arr.get(i), arr.get(i + 1)});
            }
        }

        return result;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(6);
        list.add(2);
        list.add(4);
        list.add(10); 

        List<int[]> pairs = findPairsWithMinimumDifference(list);

        System.out.println("Pairs with the minimum absolute difference:");
        for (int[] pair : pairs) {
            System.out.println(pair[0] + ", " + pair[1]);
        }
    }
}
