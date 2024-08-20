import java.util.ArrayList;
import java.util.Arrays; 
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {



    public static List<List<String>> foundAnagrams(String[] arr){

        Map<String, List<String>> map = new HashMap<>();
        
        for (String s : arr) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            
            if (!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(s);
        }
        
        return new ArrayList<>(map.values());
        
    }

    public static void main(String[] args) {

        String[] arr = {"eat","tea","tan","ate","nat","bat"};

        System.out.println(foundAnagrams(arr));
        
    }
}
