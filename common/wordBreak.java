
import java.util.HashMap;
import java.util.Map;




public class wordBreak {

    public static int romanToInt(String s) {
        Map<Character, Integer> romanToValue = new HashMap<>();
        romanToValue.put('I', 1);
        romanToValue.put('V', 5);
        romanToValue.put('X', 10);
        romanToValue.put('L', 50);
        romanToValue.put('C', 100);
        romanToValue.put('D', 500);
        romanToValue.put('M', 1000);

 
    
        int total = 0;
        int prevValue = 0;
        for (char c : s.toCharArray()) {
            int value = romanToValue.get(c);
            if (value > prevValue) {
                total += value - 2 * prevValue;
            } else {
                total += value;
            }
            prevValue = value;
        }
    
        return total;
    }

    public static void main(String[] args) {

        String s = "hello";

        System.out.println(s.substring(0,1));
     

    }
}
