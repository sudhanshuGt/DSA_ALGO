import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays; 
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.LongStream;


// a list of integer , { 3, 2, 1, 6, 7, 8, 9, 10}
// string where have to count the characters "java is object oriented"

public class newCode   {

    public static void main(String[] args) {

         List<Integer> nIntegers = new ArrayList<>();

         for(int i = 1 ; i <= 10; i++){
            nIntegers.add(i);
         }

         List<Integer> eventIntegers = new ArrayList<>();

         List<Integer> oddIntegers = new ArrayList<>();


         for(int n : nIntegers){
            if(n % 2 == 0){
                eventIntegers.add(n);
            }else{
                oddIntegers.add(n);
            }
         }


         System.out.println(" event Nums : " + eventIntegers);
         System.out.println("odd nums : " + oddIntegers);

       

        


    }
 
    
    
}
