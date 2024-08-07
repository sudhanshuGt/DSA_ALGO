import java.util.Scanner;

public class BeautifulYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int y = sc.nextInt();
        while(true){
            y++;
            String yString = String.valueOf(y);
            boolean isDistinct = true;
            for(int i = 0; i < yString.length(); i++ ){
                for(int j = i+1; j < yString.length(); j++){
                    if(yString.charAt(i) == yString.charAt(j)){
                        isDistinct = false;
                        break;
                    }
                }
                if(!isDistinct){
                    break;
                }
            }
            if(isDistinct){
                System.out.println(y);
                break;
            }
        }
        sc.close();
    }
}
