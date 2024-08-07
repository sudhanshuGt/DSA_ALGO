public class reverseStringWithoutLopOrFun {
    public static void main(String[] args) {
        String s_ = "Description";

        System.out.println(reverse(s_));
    }

    public static String reverse(String s) { 
        if(s.length() == 0) 
          return ""; 
        return s.charAt(s.length() - 1) + reverse(s.substring(0,s.length()-1)); 
      } 
}
