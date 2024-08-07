import java.util.ArrayList;
import java.util.List;

public class lengthOfLastWord {

    public static int lastWordLen(String s){
        
        String s_ = "";
        List<String> newL = new ArrayList<>();
        for(int i = 0; i < s.length(); i++){
            if(s.substring(i,i+1).equals(" ") || i == s.length()){
                if(!s_.isEmpty()){
                    newL.add(s_);
                }
                s_ = "";
                continue;
            }else{
                s_ += s.substring(i, i+1);
            }
        }
        System.out.println(newL);
        return newL.isEmpty() ? -1 : newL.get(newL.size()-1).length();
    }

    public static void main(String[] args) {
        String s = "luffy is still joyboy";

        System.out.println(lastWordLen(s));
    }
}
