import java.util.Scanner;

public class QueueattheSchool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int s = sc.nextInt();

        String studentQueueString = sc.next();
        String newStudeString = "";

        for(int i = 0; i < s; i++){
            newStudeString = "";
            for(int j = 0; j < n; j++){
                if(String.valueOf(studentQueueString.charAt(j)).equalsIgnoreCase("B")){
                    if(j != studentQueueString.length()-1){
                        if(String.valueOf(studentQueueString.charAt(j + 1)).equalsIgnoreCase("G")){
                            newStudeString+= "GB";
                            j++;
                        }else{
                            newStudeString += studentQueueString.charAt(j);
                            continue;
                        }
                    }else{
                        newStudeString += studentQueueString.charAt(j);
                        continue;
                    }
                }else{
                    newStudeString += studentQueueString.charAt(j);
                    continue;
                }
            }
            studentQueueString = newStudeString;
        }
        System.out.println(newStudeString);
        sc.close();
    }
}
