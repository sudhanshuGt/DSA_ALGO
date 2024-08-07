import java.util.Scanner;

public class findGCDorHCF {

    public static Integer gcdIs(int a, int b){

        Integer gcdInteger = 1; 

        for(int i = Math.min(a, b); i > 0; i-- ){
            if (a % 2 == 0 && b % 2 == 0) {
                gcdInteger = i;
                break;
            }
        } 


        return gcdInteger;
    }

    public static void main(String[] args) {
        int n , m;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        sc.close();



        System.out.println(gcdIs(n, m));
    }
}
