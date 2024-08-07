import java.util.Scanner;

public class AntonandDanik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String Winner = sc.next();
        int anton = 0;
        int danik = 0;

        for(int i = 0; i < n; i++){
            if(String.valueOf(Winner.charAt(i)).equalsIgnoreCase("A")){
                anton++;
            }else if(String.valueOf(Winner.charAt(i)).equalsIgnoreCase("D")){
                danik++;
            }
        }

        if(anton > danik){
            System.out.println("Anton");
        }else if(danik > anton){
            System.out.println("Danik");
        }else if(anton == danik){
            System.out.println("Friendship");
        }
        sc.close();
    }
}
