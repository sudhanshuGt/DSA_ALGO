import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class splitwordInString {
    public static void main(String[] args) {
        String sentence = "a good   example";
        System.out.println(sentence);
        String[] words = sentence.split("\\s+");
        List<String> newStrings = new ArrayList<>(Arrays.asList(words));
        Collections.reverse(newStrings);
        String result = String.join(" ", newStrings);
        System.out.println(result);

    }
}
