import java.util.HashMap;
import java.util.Map;

public class countRepeatedItem {
    public static void main(String[] args) {
        String name = "Sudhanshu";

        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char c : name.toCharArray()) {
            if (charCountMap.containsKey(c)) { 
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else { 
                charCountMap.put(c, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println("'" + entry.getKey() + "' = " + entry.getValue() + " times");
        }
    }
}
