import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class playerRatingInRange {

    public static void main(String[] args) {
        List<Integer> playIntegers = new ArrayList<>(Arrays.asList(15, 4, 6, 13, 5, 10));
        
        Set<List<Integer>> unLists = new HashSet<>();

        for(int i = 0; i < playIntegers.size(); i++){
            for(int j = 0; j < playIntegers.size(); j++){
                for(int k = 0; k < playIntegers.size(); k++){
                    if (playIntegers.get(i) != playIntegers.get(j) && playIntegers.get(i)
                               != playIntegers.get(k) && playIntegers.get(j) != playIntegers.get(k) ) {
                                if ((playIntegers.get(i) >= 4 && playIntegers.get(i) <= 10) && (playIntegers.get(j) >= 4 && playIntegers.get(j) <= 10) && 
                                (playIntegers.get(k) >= 4 && playIntegers.get(k) <= 10)) {
                                    List<Integer> nIntegers = new ArrayList<>(Arrays.asList(playIntegers.get(i), playIntegers.get(j), playIntegers.get(k)));
                                    Collections.sort(nIntegers);
                                    unLists.add(nIntegers);
                                }
                         
                     }
                }
            }
        }

        System.out.println(unLists);
    }

     
}
