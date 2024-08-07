import java.util.Scanner;

public class Translation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();

        String result = "YES";
        int j = b.length()-1;
        for(int i = 0; i < a.length(); i++){
            if(String.valueOf(a.charAt(i)).equalsIgnoreCase(String.valueOf(b.charAt(j)))){
                j--;
                continue;
            }else if(!String.valueOf(a.charAt(i)).equalsIgnoreCase(String.valueOf(b.charAt(j)))){
                result = "NO";
                break;
            }

        }
        System.out.println(result);
        sc.close();
    }
}
