import java.util.Scanner;

public class SearchofanEasyProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        String r = "EASY";
        for(int i =0 ; i < p; i++){
            int opinion = sc.nextInt();
            if(opinion == 1){
                r = "HARD";
            }else{
                continue;
            }
        }

        System.out.println(r);
        sc.close();
    }
}
