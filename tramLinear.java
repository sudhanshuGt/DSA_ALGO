import java.util.Scanner;

public class tramLinear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int h = 0;
        int exitPeople = 0;
        int enteredPeople = 0;
        int currentPeople = 0;

        for(int  i = 0; i < n; i++){
            exitPeople = sc.nextInt();
            enteredPeople = sc.nextInt();

            if(currentPeople <= 0){
                currentPeople = enteredPeople - exitPeople;
            }else if(currentPeople > 0){
                currentPeople = (currentPeople - exitPeople) + enteredPeople;
            }
            if(h < currentPeople){
                h = currentPeople;
            }
        }

        System.out.println(h);
        sc.close();
    }
}
