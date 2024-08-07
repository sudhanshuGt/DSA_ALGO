import java.util.Scanner;

public class UltraFastMathematician {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String  a = sc.nextLine();
        String b = sc.nextLine();
        String n = "";

        for(int i = 0; i < a.length(); i++){
            if(String.valueOf(a.charAt(i)).equalsIgnoreCase(String.valueOf(b.charAt(i)))){
                n += "0";
            }else{
                n+= "1";
            }
        }

        System.out.println(n);
        sc.close();
    }
}
