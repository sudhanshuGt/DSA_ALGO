public class reverseVowelString {

    public static boolean isVowel(char ch) { 
        char lowerCh = Character.toLowerCase(ch);
        return lowerCh == 'a' || lowerCh == 'e' || lowerCh == 'i' || lowerCh == 'o' || lowerCh == 'u';
    }


    public static String reverseString(String s){
        StringBuilder rBuilder = new StringBuilder(s);

        int start = 0;
        int end = s.length()-1;

        while (start < end) {
            System.out.println("Start >> " + start  + "end >> " + end);
            System.out.println("end >> " + end);
            if(isVowel(rBuilder.charAt(start)) && isVowel(rBuilder.charAt(end))){
                char temp = rBuilder.charAt(start);
                rBuilder.insert(start, rBuilder.charAt(end));
                rBuilder.insert(end, temp);
                start++;
                end--; 
            }else if (isVowel(rBuilder.charAt(start)) && !isVowel(rBuilder.charAt(end))) {
                end--; 
            }else if (!isVowel(rBuilder.charAt(start)) && isVowel(rBuilder.charAt(end))) {
                start++; 
            }else if (!isVowel(rBuilder.charAt(start)) && !isVowel(rBuilder.charAt(end))) {
                end--;
                start++; 
            } 
        }

        return rBuilder.toString();

    }


    public static void main(String[] args) {
        String string = "hello";
        System.err.println(string);
        System.out.println(reverseString(string));
        
    }
}
