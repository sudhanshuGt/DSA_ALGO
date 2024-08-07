public class plusOne{
    public static void main(String[] args) {
        int[] digits = {1, 2, 4};
        int realInt = 0;
 
        for (int i = 0; i < digits.length; i++) {
            realInt = realInt * 10 + digits[i];
        }
 
        realInt += 1;

        System.out.println(realInt); 
    }
}