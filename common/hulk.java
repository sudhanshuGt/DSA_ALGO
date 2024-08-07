import java.util.Scanner;

public class hulk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String r = "";
        for(int i = 1; i <= n; i++){
            r += i % 2 == 0 ? i == n ? "I love it" : "I love that " : 
            i % 2 != 0 && n > 1 ?  i == n ? "I hate it" : "I hate that " :
             "I hate it";
        }
        System.out.println(r);
        sc.close();
    }
}