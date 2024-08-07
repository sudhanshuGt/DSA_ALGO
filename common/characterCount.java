import java.util.HashMap;
import java.util.Map;

public class characterCount {
    
    public static void main(String[] args) {
        String jString = "language";
        

        Map<Character, Integer> cMap = new HashMap<>();

        for(char c : jString.toCharArray()){
            if(cMap.containsKey(c)){
                cMap.put(c, cMap.get(c) + 1);
            }else{
                cMap.put(c, 1);
            }
        }


        for(Map.Entry<Character, Integer> entry : cMap.entrySet()){
            System.out.println(" char " + entry.getKey() + " occ ures " + entry.getValue() + " times");
        }
    }
}
