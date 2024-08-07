import java.util.Scanner;

public class accomodation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numberOfRooms = sc.nextInt();
        int roomAvailable = 0;
        for(int i = 0; i < numberOfRooms; i++){
            int p  = sc.nextInt();
            int a = sc.nextInt();
            if((a - p) >= 2){
                roomAvailable++;
            }else{
                continue;
            }
        }

        System.out.println(roomAvailable);
        sc.close();

    }
}
