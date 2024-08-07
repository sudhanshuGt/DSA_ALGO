import java.util.Scanner;

public class NearlyLuckyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nStr = sc.next();
        int count = 0;
        
        // Count the number of lucky digits in the number
        for (int i = 0; i < nStr.length(); i++) {
            char digit = nStr.charAt(i);
            if (digit == '4' || digit == '7') {
                count++;
            }
        }
        
        // Check if the count of lucky digits is a lucky number
        boolean isNearlyLucky = isLucky(count);
        
        // Print the output
        if (isNearlyLucky) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
    
    // Check if a number is a lucky number
    private static boolean isLucky(int n) {
        if (n == 0) {
            return false;
        }
        while (n > 0) {
            int digit = n % 10;
            if (digit != 4 && digit != 7) {
                return false;
            }
            n /= 10;
        }
        return true;
    }
}
