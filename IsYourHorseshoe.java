import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class IsYourHorseshoe {
    public static void main(String[] args) {
        int count = 0;
        List<Long> colours  = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 4; i++){
            colours.add(sc.nextLong());
        }


        Collections.sort(colours);
       

        for(int i = 0; i < colours.size() - 1; i++){
            if (colours.get(i).equals(colours.get(i + 1))) {
                count++;
            }
        }


        System.out.println(count);
        sc.close();
    }
}
