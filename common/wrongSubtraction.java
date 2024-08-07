import java.util.Scanner;

public class wrongSubtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for(int i = 0; i < m; i++){
            if(n % 10 > 0){
                n--;
            }else{
                n = n / 10;
            }
        }

        System.out.println(n);
        sc.close();
    }
}