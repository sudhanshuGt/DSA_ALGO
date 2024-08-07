import java.util.Scanner;

public class DivisibilityProb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            long a = sc.nextLong();
            long b = sc.nextLong();

            long remainder = a % b;
            long count = remainder == 0 ? 0 : b - remainder;

            System.out.println(count);
        }

        sc.close();
    }
}
