import java.util.Scanner;

public class Magnets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();  

        int groups = 1;
        String prevMagnet = sc.nextLine();

        for (int i = 1; i < n; i++) {
            String magnet = sc.nextLine();
            if (!magnet.equals(prevMagnet)) {
                groups++;
                prevMagnet = magnet;
            }
        }

        System.out.println(groups);
        sc.close();
    }
}
