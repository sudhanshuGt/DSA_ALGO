import java.util.ArrayList;
import java.util.List;

public class kidWithCandy {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int gr_ = Integer.MIN_VALUE;
        for(int i= 0 ; i < candies.length; i++){
            if(gr_ < candies[i]){
                gr_ = candies[i];
            }
        }

        List<Boolean> rBooleans = new ArrayList<>();

        for(int j = 0 ; j < candies.length; j++){
            if (candies[j] + extraCandies >= gr_) {
                rBooleans.add(true);
            }else{
                rBooleans.add(false);
            }
        }

        return rBooleans;
    }


    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;

        System.out.println(kidsWithCandies(candies, extraCandies));

    }
}
