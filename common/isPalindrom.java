import java.util.Scanner;

public class isPalindrom {
    public static void main(String[] args) {
        int n, result = 0, lastDigit;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.close();

        int originalNum = n;

        while (n > 0) {
             lastDigit = n % 10;
             n = n / 10;
             result = (result * 10) + lastDigit;
        }
        
    
        if (originalNum == result) {
            System.out.println(originalNum + " is pallindrom");
        }else{
            System.out.println(originalNum + " is not pallindrom");
        }
    }
}
