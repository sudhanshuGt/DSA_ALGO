import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class streamExample {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(2,3, 4, 5, 1, 3, 5,5));

       int l =  nums.stream().map(n -> n * 3) 
                     .reduce(0, (n, m) -> n + m);

                     System.out.println(l);
    }
}
