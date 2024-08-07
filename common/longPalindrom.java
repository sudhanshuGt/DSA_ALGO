import java.util.HashMap;

public class longPalindrom {

    public static int longestPalindrome(String s) {
        HashMap<Character, Integer> charCount = new HashMap<>();
        
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1); 
        }

        System.out.println(charCount);
        
        int length = 0;
        boolean hasOdd = false;
        
        for (int count : charCount.values()) {
            if (count % 2 == 0) {
                length += count;
            } else {
                length += count - 1;
                hasOdd = true;
            }
        }
        
        if (hasOdd) {
            length += 1;
        }
        
        return length;
    }

    public static void main(String[] args) {
        String s = "abcccclllllllllllldd";

        System.out.println(longestPalindrome(s));
    }
}
