public class isPallindromString {

    public static String reveseString(String s){
        if (s == null || s.length() <= 1) {
            return s;
        }
        return reveseString(s.substring(1)) + s.charAt(0);
    }

    public static String cleanString(String input) { 
        String cleaned = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return cleaned;
    }


    public static void main(String[] args) {
        String  s = "0P";

        System.out.println(cleanString(s).equals(reveseString(cleanString(s))));

    }
}
