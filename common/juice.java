import java.util.Scanner;

public class juice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        double s = 0; 
        double f = 0;

        for(int i = 0; i < n; i++){
            int j  = sc.nextInt();
            s += j;
        }

        f = s / n;
        System.out.printf("%f", f);
        sc.close();
    }
}
