

public class greatestCommonDivString {

    public static String gcdOfStrings(String str1, String str2) { 
         if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        } 
        int gcdLength = gcd(str1.length(), str2.length()); 
        System.out.println("gdc len = " + gcdLength);
        return str1.substring(0, gcdLength); 
    }

    private static int gcd(int a, int b) {
        System.out.println( " a = " + a  + " b = " + b);
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        String str1 = "ABCABC", str2 = "ABC";

        System.out.println(gcdOfStrings(str1, str2));;
    }
}
