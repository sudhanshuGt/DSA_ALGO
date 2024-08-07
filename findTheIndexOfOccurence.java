public class findTheIndexOfOccurence {

    public static void main(String[] args) {
        String haystack = "hello", needle = "ll"; 
        boolean found = false;

        
        for (int i = 0; i <= haystack.length() - needle.length(); i++) { 
            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                found = true;
                break;  
            }
        }

        System.out.println(found);
        
    }
}
